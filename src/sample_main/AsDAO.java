package sample_main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AsDAO {

	final String jdbcId = "root";
	final String jdbcPass = "root";
	final String jdbcUrl = "jdbc:mysql://localhost:3306/employee";

	public String findAccount(String id,String pass) {



		 try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

	            String sql = "SELECT * FROM administrator WHERE id = ? AND pass = ?";
	            PreparedStatement ps= con.prepareStatement(sql);

	            ps.setString(1, id);
	            ps.setString(2, pass);

	            ResultSet rs = ps.executeQuery();

	            if(rs.next()) {

	            return id;

	            }else {

	            return null;}

	           }catch(SQLException e) {
	        	   e.printStackTrace();
	        	   return null;
	           }


}
}
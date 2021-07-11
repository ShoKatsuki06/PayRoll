package sample_main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AccountDAO {

	final String jdbcId = "root";
	final String jdbcPass = "root";
	final String jdbcUrl = "jdbc:mysql://localhost:3306/employee";

	public AccountBeans findAccount(AccountBeans ab) {


		AccountBeans returnAb = new AccountBeans();

		 try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

	            String sql = "SELECT * FROM workman WHERE id = ? AND pass = ?";
	            PreparedStatement ps= con.prepareStatement(sql);

	            ps.setString(1, ab.getId());
	            ps.setString(2, ab.getPass());

	            ResultSet rs = ps.executeQuery();

	            if(rs.next()) {

	            returnAb.setId(rs.getString("id"));
	            returnAb.setPass(rs.getString("pass"));
	            returnAb.setName(rs.getString("name"));
	            returnAb.setWorkplace(rs.getString("workplace"));
	            returnAb.setSalary(rs.getInt("worksalary"));

	            }else {

	            return null;}

	           }catch(SQLException e) {
	        	   e.printStackTrace();
	        	   return null;
	           }

	           return returnAb;
	}
	}

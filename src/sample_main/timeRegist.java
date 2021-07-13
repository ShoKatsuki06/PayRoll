package sample_main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class timeRegist {


	public void regist(String id,String month,String day,String start,String end,int rest,int salary) throws SQLException, ClassNotFoundException{

		String URL = "jdbc:mysql://localhost:3306/employee?useUnicode=true&characterEncoding=utf8";
		String User_Name = "root";
		String Pass = "root";
		Connection con = null;
	    PreparedStatement stmt = null;

	    con = DriverManager.getConnection(URL,User_Name,Pass);
		Class.forName("com.mysql.jdbc.Driver");

		String sql2 = "INSERT INTO worktime1 VALUES(?,?,?,?,?,?,?)";
		stmt = con.prepareStatement(sql2);
		stmt.setString(1, id);
		stmt.setString(2, month);
		stmt.setString(3, day);
		stmt.setString(4, start);
		stmt.setString(5, end);
		stmt.setInt(6,rest);
		stmt.setInt(7, salary);
		int rs = stmt.executeUpdate();
		System.out.println(rs);
	}
}

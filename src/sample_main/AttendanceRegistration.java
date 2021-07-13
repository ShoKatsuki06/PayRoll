package sample_main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AttendanceRegistration {


	 public  void regist(String id,String startTime,String endTime,int restTime) throws SQLException, ClassNotFoundException, IOException{


			String URL = "jdbc:mysql://localhost:3306/employee?useUnicode=true&characterEncoding=utf8";
			String User_Name = "root";
			String Pass = "root";
			Connection con = null;
		    PreparedStatement stmt = null;

		    con = DriverManager.getConnection(URL,User_Name,Pass);
			Class.forName("com.mysql.jdbc.Driver");

			String sql2 = "INSERT INTO worktime1 VALUES(?,?,?,?)";
			stmt = con.prepareStatement(sql2);
			stmt.setString(1, id);
			stmt.setString(2, startTime);
			stmt.setString(3, endTime);
			stmt.setInt(4, restTime);
			}

}

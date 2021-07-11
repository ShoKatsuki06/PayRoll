package sample_main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class signUp {



	public String signup(String workManName,String pass,String workplace,int worksalary) throws SQLException, ClassNotFoundException, IOException {


		     String URL = "jdbc:mysql://localhost:3306/employee?useUnicode=true&characterEncoding=utf8";
		     String User_Name = "root";
		     String Pass = "root";
		     Connection con = null;

		     PreparedStatement stmt = null;

		     con = DriverManager.getConnection(URL,User_Name,Pass);
		     Class.forName("com.mysql.jdbc.Driver");



		     int[] idNumber = new int[4];
				for(int i=0; i<idNumber.length; i++) {
	            idNumber[i] = (int)(Math.random()*10);
			}
				String id1 = String.valueOf(idNumber[0]);
				String id2 = String.valueOf(idNumber[1]);
				String id3 = String.valueOf(idNumber[2]);
				String id4 = String.valueOf(idNumber[3]);


				String id = id1+id2+id3+id4;



		    	    String sql ="INSERT INTO workman VALUES(?,?,?,?,?)";
					stmt = con.prepareStatement(sql);
					stmt.setString(1, id);
					stmt.setString(2, pass);
					stmt.setString(3 ,workManName);
					stmt.setString(4, workplace);
					stmt.setInt(5, worksalary);


				int count = stmt.executeUpdate();

		        return id;



	}

			}


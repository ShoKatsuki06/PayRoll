package sample_main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class List
 */
@WebServlet("/List")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public List() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub


		final String jdbcId = "root";
		final String jdbcPass = "root";
		final String jdbcUrl = "jdbc:mysql://localhost:3306/employee?useUnicode=true&characterEncoding=utf8";



			 try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

		            String sql = "SELECT * FROM workman ";
		            PreparedStatement ps= con.prepareStatement(sql);
		            ArrayList<Workman> list = new ArrayList<Workman>();


		            ResultSet rs = ps.executeQuery();

		            while(rs.next()) {

		            String id = rs.getString("id");
		            String name =rs.getString("name");
		            String workplace = rs.getString("workplace");
		            int salary = rs.getInt("worksalary");
		            System.out.println(id);
		            list.add(new Workman(id,name,workplace,salary));

		            }

		            HttpSession session = req.getSession();
		            session.setAttribute("nlist",list);

		            RequestDispatcher rd = req.getRequestDispatcher("memberList.jsp");
		            rd.forward(req, res);

		           }catch(SQLException e) {
		        	   e.printStackTrace();

		           }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

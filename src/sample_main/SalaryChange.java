package sample_main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SalaryChange
 */
@WebServlet("/SalaryChange")
public class SalaryChange extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalaryChange() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs = req.getSession(true);
		 Object wr = hs.getAttribute("id");
		 if(wr == null){
			 	res.sendRedirect( "AdministratorLogin.jsp" );
			 	return;
		 }


		String id = req.getParameter("id");
		String salary = req.getParameter("salary");

		int Salary = Integer.parseInt(salary);

		System.out.println(salary);

		final String jdbcId = "root";
		final String jdbcPass = "root";
		final String jdbcUrl = "jdbc:mysql://localhost:3306/employee?useUnicode=true&characterEncoding=utf8";



			 try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

		            String sql = "UPDATE workman SET worksalary = ? WHERE id = ?";
		            PreparedStatement ps= con.prepareStatement(sql);

		            ps.setString(2, id);
		            ps.setInt(1, Salary);

		            int num = ps.executeUpdate();

		            System.out.println(num);

		            PrintWriter out = res.getWriter();


		            out.println("<html>");
					out.println("<head><meta http-equiv=\"content-type\" charset=\"UTF-8\"><title>");
					out.println("変更完了");
					out.println("</title></head>");
					out.println("<h1>変更が完了しました</h1>");
					out.println("<a href=\"Administrator.jsp\">メインメニュー</a>");


	} catch (SQLException e) {
		// TODO 自動生成された catch ブロック
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

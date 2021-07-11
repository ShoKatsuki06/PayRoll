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
 * Servlet implementation class WorkManDelete
 */
@WebServlet("/WorkManDelete")
public class WorkManDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorkManDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession hs = req.getSession(true);
		Workman wr = (Workman)hs.getAttribute("id");
		 if(wr == null){
			 	res.sendRedirect( "AdministratorLogin.jsp" );
			 	return;
		 }

		String id = req.getParameter("ID");

		System.out.println(id);

		final String jdbcId = "root";
		final String jdbcPass = "root";
		final String jdbcUrl = "jdbc:mysql://localhost:3306/employee";
		PreparedStatement stmt = null;

	    try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {


	                con.setAutoCommit(false);
	    	        Class.forName("com.mysql.jdbc.Driver");

		            String sql = "DELETE FROM workman WHERE id = ?";

		            stmt = con.prepareStatement(sql);

		            stmt.setString(1, id);

		            int num = stmt.executeUpdate();
		            System.out.println(num);

		            con.commit();

		  		     PrintWriter out = res.getWriter();


		            out.println("<html>");
					out.println("<head><meta http-equiv=\"content-type\" charset=\"UTF-8\"><title>");
					out.println("削除完了");
					out.println("</title></head>");
					out.println("<h1>削除が完了しました</h1>");
					out.println("<a href=\"Administrator.jsp\">メインメニュー</a>");

	} catch (SQLException e) {
		// TODO 自動生成された catch ブロック
		res.sendRedirect( "AdministratorLogin.jsp" );
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO 自動生成された catch ブロック
		e.printStackTrace();
		res.sendRedirect( "AdministratorLogin.jsp" );
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

package sample_main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DailySalaryConfirmation
 */
@WebServlet("/DailySalaryConfirmation")
public class DailySalaryConfirmation extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DailySalaryConfirmation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {



		HttpSession hs = req.getSession(true);
		AccountBeans ab = (AccountBeans)hs.getAttribute("account");
		 if(ab == null){
			 	res.sendRedirect( "Login.jsp" );
			 	return;
			 }
		String id = ab.getId();

		String month = req.getParameter("month");
		String day = req.getParameter("day");
		final String jdbcId = "root";
		final String jdbcPass = "root";
		final String jdbcUrl = "jdbc:mysql://localhost:3306/employee?useUnicode=true&characterEncoding=utf8";
		String sql = "SELECT * FROM worktime1 WHERE month = ? AND id = ? AND day = ?";
		Connection con;
		try {
			con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, month);
			ps.setString(2, id);
			ps.setString(3, day);

			ResultSet rs = ps.executeQuery();

			int salary = 0;

			if(rs.next()) {
				salary = rs.getInt("salary");
			}

			PrintWriter out = res.getWriter();

			out.println("<html>");
			out.println("<head><meta http-equiv=\"content-type\" charset=\"UTF-8\"><title>");
			out.println("日別給料");
			out.println("</title></head>");
			out.println("<h1>あなたの給料は"+ salary +"円です</h1>");
			out.println("<a href=\" http://localhost:8080/PayRoll/loginSuccess.jsp\">メインメニューはこちら</a>");

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

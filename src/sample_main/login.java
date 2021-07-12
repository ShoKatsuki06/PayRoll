package sample_main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		res.setContentType("text/html; charset = UTF-8");

		 String id = req.getParameter("AAA");
		 String pass = req.getParameter("BBB");

		 AccountBeans ab =new AccountBeans();
		 ab.setId(id);
		 ab.setPass(pass);

		 AccountDAO ad = new AccountDAO();
		 AccountBeans returnAb = null;
		returnAb = ad.findAccount(ab);

		 if(returnAb != null) {
	            // セッションにアカウント情報＆ロールを登録
	            HttpSession session = req.getSession();
	            session.setAttribute("account", returnAb);

	            RequestDispatcher rd = req.getRequestDispatcher("loginSuccess.jsp");
	            rd.forward(req, res);

	        } else {
	            RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
	            rd.forward(req, res);
	        }
	}

	/**
	 *
	 *
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

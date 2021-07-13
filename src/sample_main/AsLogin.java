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
 * Servlet implementation class AsLogin
 */
@WebServlet("/AsLogin")
public class AsLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AsLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub



		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");

		AsDAO ad = new AsDAO();
		String aid = ad.findAccount(id, pass);

		if(aid != null) {
			 HttpSession session = req.getSession();
	         session.setAttribute("id", id);

	         RequestDispatcher rd = req.getRequestDispatcher("Administrator.jsp");
	         rd.forward(req, res);
		}else {

			 RequestDispatcher rd = req.getRequestDispatcher("AsError.jsp");
	         rd.forward(req, res);
	}
	}

}

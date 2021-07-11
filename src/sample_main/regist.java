package sample_main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class regist
 */
@WebServlet("/regist")
public class regist extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public regist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		  String name = req.getParameter("aaa");
		  String pass = req.getParameter("bbb");
		  String workplace = req.getParameter("ccc");
		  String salary = req.getParameter("ddd");

		  int Salary = Integer.parseInt(salary);

		  signUp s = new signUp();
		  String id = null;
		  try {
			  id = s.signup(name, pass, workplace, Salary);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		  PrintWriter out = res.getWriter();

			out.println("<html>");
			out.println("<head><meta http-equiv=\"content-type\" charset=\"UTF-8\"><title>");
			out.println("新規登録完了");
			out.println("</title></head>");
			out.println("<h1>あなたのIDは"+ id +"</h1>");
			out.println("<a href=\"Login.jsp\">メインメニューはこちら</a>");


			System.out.println(System.getProperty("file.encoding"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

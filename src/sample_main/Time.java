package sample_main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Time
 */
@WebServlet("/Time")
public class Time extends HttpServlet {
	private static final long serialVersionUID = 1L;



    /**
     * @see HttpServlet#HttpServlet()
     */
    public Time() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String Day = req.getParameter("day");
		String md[] = Day.split("/");
		String month = md[0];
		String day = md[1];
		String start = req.getParameter("start");
		String end = req.getParameter("end");
		String rest = req.getParameter("rest");
		int restTime = Integer.parseInt(rest);

		HttpSession hs = req.getSession(true);
		AccountBeans ab = (AccountBeans)hs.getAttribute("account");

	    int salary = ab.getSalary();
	    String id = ab.getId();

	    salaryCalculation sc = new salaryCalculation();
	   int tsalary = sc.calculation(start,end,restTime,salary);

	    timeRegist tr = new timeRegist();
	    try {
			tr.regist(id, month, day, start, end, restTime, tsalary);
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	    PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<style>\r\n" +
				"body {\r\n" +
				"    background: #eeeeee;\r\n" +
				"    font-family: Meiryo;\r\n" +
				"    width:700px;\r\n" +
				"    margin-right: auto;\r\n" +
				"   margin-left : auto;\r\n" +
				"  font-size:140%\r\n" +
				"  }\r\n" +
				"  p {\r\n" +
				"  line-height: 28px;\r\n" +
				"  margin-bottom: 25px;\r\n" +
				"   margin-right: auto;\r\n" +
				"   margin-left : auto;\r\n" +
				"}\r\n" +
				"+h2 {\r\n" +
				"  position: relative;\r\n" +
				"  padding: 1rem .5rem;\r\n" +
				"}\r\n" +
				"\r\n" +
				"h2:after {\r\n" +
				"  position: absolute;\r\n" +
				"  bottom: 0;\r\n" +
				"  left: 0;\r\n" +
				"  width: 100%;\r\n" +
				"  height: 6px;\r\n" +
				"  content: '';\r\n" +
				"  border-radius: 3px;\r\n" +
				"  background-image: -webkit-gradient(linear, right top, left top, from(#2af598), to(#009efd));\r\n" +
				"  background-image: -webkit-linear-gradient(right, #2af598 0%, #009efd 100%);\r\n" +
				"  background-image: linear-gradient(to left, #2af598 0%, #009efd 100%);\r\n" +
				"}\r\n" +
				"</style>");
		out.println("<head><meta http-equiv=\"content-type\" charset=\"UTF-8\"><title>");
		out.println("新規登録完了");
		out.println("</title></head>");
		out.println("<h2>あなたの給料は"+ tsalary +"円です</h2>");
		out.println("<a href=\"./loginSuccess.jsp\">メインメニューはこちら</a>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

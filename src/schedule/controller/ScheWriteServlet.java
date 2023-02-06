package schedule.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import schedule.model.vo.Schedule;

/**
 * Servlet implementation class ScheWriteServlet
 */
@WebServlet("/schedule/write")
public class ScheWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScheWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/schedule/write.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String scheTitle = request.getParameter("sche-title");
		int scheDeadline = Integer.parseInt(request.getParameter("sche-deadline"));
		String scheOfficialCheck = request.getParameter("sche-official-check");
		String scheTodo = request.getParameter("sche-todo");
		String scheWithWhom = request.getParameter("sche-with-whom");
		String scheToWhere = request.getParameter("sche-to-where");
		HttpSession session = request.getSession();
		if(session != null && (session.getAttribute("memId"))!=null) {
			String memId = (String)session.getAttribute("memId");
			Schedule schedule = new Schedule(scheTitle, scheDeadline, scheOfficialCheck, scheTodo, scheWithWhom, scheToWhere);
			schedule.set
		}
	}

}

















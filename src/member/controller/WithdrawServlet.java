package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;

/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/member/withdraw")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memId = request.getParameter("mem-id");
		MemberService mService = new MemberService();
		int result = mService.deleteMember(memId);
		HttpSession session = request.getSession();//ⓐ이렇게 하는거 맞나?
		if(result>0) {
			session.removeAttribute( "memId" );
			//ⓑ탈퇴했는데 왜 세션이 안비워지지?? 해서 이거 추가해봄. 일단 됨.
			request.setAttribute("title", "탈퇴 성공");
			request.setAttribute("msg", "혹시 나중에 기억나면 한번 들러주세요ㅜㅜ");
			request.getRequestDispatcher("/WEB-INF/views/common/msg-popup.jsp").forward(request, response);
		}else {
			request.setAttribute("title", "탈퇴 실패");
			request.setAttribute("msg", "다시 시도해 주세요.");
			request.getRequestDispatcher("/WEB-INF/views/common/msg-popup.jsp").forward(request, response);
		}
	}

		

}

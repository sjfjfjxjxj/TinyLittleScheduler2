package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class EnrollServlet
 */
@WebServlet("/member/register")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/enroll.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String memId = request.getParameter("mem-id");
		String memPw = request.getParameter("mem-pw");
		String memName = request.getParameter("mem-name");
		Member member = new Member();
		member.setMemId(memId);
		member.setMemPw(memPw);
		member.setMemName(memName);
		MemberService mService = new MemberService();
		int result = mService.registerMember(member);
		if(result>0) {
			request.setAttribute("title", "회원가입 성공!");
			request.setAttribute("msg", "만나서 반가워요. 로그인 해주세요!");
			request.getRequestDispatcher("/WEB-INF/views/common/msg-popup.jsp").forward(request, response);
		}else {
			request.setAttribute("title", "회원가입 실패");
			request.setAttribute("msg", "다시 한 번 시도해 주세요!");
			request.getRequestDispatcher("/WEB-INF/views/common/msg-popup.jsp").forward(request, response);
		}
	}

}

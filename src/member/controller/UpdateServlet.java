package member.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/member/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String memId = request.getParameter("mem-id");
		String memPw = request.getParameter("mem-pw");
		String memName = request.getParameter("mem-name");
		
		Member member = new Member(memId, memPw, memName);
		MemberService mService = new MemberService();
		int result = mService.updateMember(member);
		if(result>0) {
			request.setAttribute("title", "정보 수정 성공!");
			request.setAttribute("msg", "수정됐어요. 메인 페이지로 이동합니다!");
			request.getRequestDispatcher("/WEB-INF/views/common/msg-popup.jsp").forward(request, response);;
		}else {
			request.setAttribute("title", "오류 발생!");
			request.setAttribute("msg", "[정보 수정 실패] 다시 시도해 주세요.");
			request.getRequestDispatcher("/WEB-INF/views/common/msg-popup.jsp").forward(request, response);
		}
		
	}

}

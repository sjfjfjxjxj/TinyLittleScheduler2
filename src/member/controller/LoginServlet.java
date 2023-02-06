package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/member/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

   
	/**
	 * @param memName 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memId = request.getParameter("mem-id"); 
		String memPw = request.getParameter("mem-pw");
		
		MemberService mService = new MemberService();
		int result = mService.checkLogin(memId, memPw);
		if(result>0) {
			HttpSession session = request.getSession();
			session.setAttribute("memId", memId); //키, 밸류
			//session.setAttribute("memName", memName); 이거 어떻게 처리하지
			response.sendRedirect("/index.jsp");
		}
		else {
			//alert("아이디와 비밀번호를 확인해 주세요")
			request.setAttribute("title", "로그인 실패");
			request.setAttribute("msg", "아이디와 비밀번호를 확인해주세요");
			request.getRequestDispatcher("/WEB-INF/views/common/msg-popup.jsp").forward(request, response);
		}
	}

}








package member.model.service;

import java.sql.Connection;

import common.JDBCTemplate;
import member.model.dao.MemberDAO;
import member.model.vo.Member;

public class MemberService {
	private MemberDAO mDao;
	public MemberService() {
		mDao = new MemberDAO();
	}

	/**
	 * 아이디 비번 조회(로그인) Service
	 * @param memId
	 * @param memPw
	 * @return result
	 */
	public int checkLogin(String memId, String memPw) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = mDao.checkLogin(conn, memId, memPw);
		return result;
	}

	/**
	 * 회원가입 Service
	 * @param member
	 * @return result
	 */
	public int registerMember(Member member) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = mDao.insertMember(conn, member);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	/**
	 * 아이디 조회 Service
	 * @param memId
	 * @return member
	 */
	public Member printOneById(String memId) {
		Member member = null;
		Connection conn = JDBCTemplate.getConnection();
		member = mDao.selectOneById(conn, memId);
		return member;
	}

	/**
	 * 아이디로 회원 탈퇴 Service
	 * @param memId
	 * @return result
	 */
	public int deleteMember(String memId) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = mDao.deleteMember(conn, memId);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

	/**
	 * member로 회원정보 수정 Service
	 * @param member
	 * @return result
	 */
	public int updateMember(Member member) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = mDao.updateMember(conn,member);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

}

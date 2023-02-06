package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.model.vo.Member;

public class MemberDAO {

	/**
	 * 로그인 체크 dao
	 * @param conn
	 * @param memId
	 * @param memPw
	 * @return result
	 */
	public int checkLogin(Connection conn, String memId, String memPw) {
		String sql="SELECT COUNT(*) AS M_COUNT FROM MEMBER_TB WHERE MEM_ID=? AND MEM_PW=?";
		int result = 0;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			pstmt.setString(2, memPw);
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
				result = rset.getInt("M_COUNT");
			}
			
			pstmt.close();
			rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	/**
	 * 회원가입 dao
	 * @param conn
	 * @param member
	 * @return result
	 */
	public int insertMember(Connection conn, Member member) {
		String sql = "INSERT INTO MEMBER_TB VALUES(?,?,?,DEFAULT)";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemId());
			pstmt.setString(2, member.getMemPw());
			pstmt.setString(3, member.getMemName());
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 아이디 검색해서 회원정보 불러오기 dao
	 * @param conn
	 * @param memId
	 * @return member
	 */
	public Member selectOneById(Connection conn, String memId) {
		String sql = "SELECT * FROM MEMBER_TB WHERE MEM_ID=?";
		Member member = null;
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, memId);
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
				member = new Member();
				member.setMemId(rset.getString("MEM_ID"));
				member.setMemPw(rset.getString("MEM_PW"));
				member.setMemName(rset.getString("MEM_NAME"));
				member.setMemEnrollDate(rset.getTimestamp("MEM_ENROLL_DATE"));
			}
			rset.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	/**
	 * 아이디로 회원탈퇴 dao 
	 * @param conn
	 * @param memId
	 * @return result
	 */
	public int deleteMember(Connection conn, String memId) {
		int result = 0;
		String sql = "DELETE FROM MEMBER_TB WHERE MEM_ID=?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memId);
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int updateMember(Connection conn, Member member) {
		String sql="UPDATE MEMBER_TB SET MEM_PW=?, MEM_NAME=? WHERE MEM_ID=?";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemPw());
			pstmt.setString(2, member.getMemName());
			pstmt.setString(3, member.getMemId());
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}

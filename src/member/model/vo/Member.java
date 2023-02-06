package member.model.vo;

import java.sql.Timestamp;

public class Member {
	
	private String memId;
	private String memPw;
	private String memName;
	private Timestamp memEnrollDate;
	
	public Member() {}

	public Member(String memId, String memPw, String memName) {
		super();
		this.memId=memId;
		this.memPw=memPw;
		this.memName=memName;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public Timestamp getMemEnrollDate() {
		return memEnrollDate;
	}

	public void setMemEnrollDate(Timestamp memEnrollDate) {
		this.memEnrollDate = memEnrollDate;
	}

	@Override
	public String toString() {
		return "Member [memId=" + memId + ", memPw=" + memPw + ", memName=" + memName + ", memEnrollDate="
				+ memEnrollDate + "]";
	}
	
	
	
}

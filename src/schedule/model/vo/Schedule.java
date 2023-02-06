package schedule.model.vo;

public class Schedule {
	
	private String scheTitle;
	private int scheDeadline;
	private String scheOfficialCheck;
	private String scheTodo;
	private String scheWithWhom;
	private String scheToWhere;
	private String scheSysdate;
	private String memId;
	
	public Schedule() {
		super();
	}

	public Schedule(String scheTitle, int scheDeadline, String scheOfficialCheck, String scheTodo, String scheWithWhom,
			String scheToWhere, String memId) {
		super();
		this.scheTitle = scheTitle;
		this.scheDeadline = scheDeadline;
		this.scheOfficialCheck = scheOfficialCheck;
		this.scheTodo = scheTodo;
		this.scheWithWhom = scheWithWhom;
		this.scheToWhere = scheToWhere;
		this.memId = memId;
		
	}

	public void setMemId(String memId) {
		this.memId = memId;
		
	}
	public String getMemId() {
		return memId;		
	}
	public String getScheTitle() {
		return scheTitle;
	}

	public void setScheTitle(String scheTitle) {
		this.scheTitle = scheTitle;
	}

	public int getScheDeadline() {
		return scheDeadline;
	}

	public void setScheDeadline(int scheDeadline) {
		this.scheDeadline = scheDeadline;
	}

	public String getScheOfficialCheck() {
		return scheOfficialCheck;
	}

	public void setScheOfficialCheck(String scheOfficialCheck) {
		this.scheOfficialCheck = scheOfficialCheck;
	}

	public String getScheTodo() {
		return scheTodo;
	}

	public void setScheTodo(String scheTodo) {
		this.scheTodo = scheTodo;
	}

	public String getScheWithWhom() {
		return scheWithWhom;
	}

	public void setScheWithWhom(String scheWithWhom) {
		this.scheWithWhom = scheWithWhom;
	}

	public String getScheToWhere() {
		return scheToWhere;
	}

	public void setScheToWhere(String scheToWhere) {
		this.scheToWhere = scheToWhere;
	}

	public String getScheSysdate() {
		return scheSysdate;
	}

	public void setScheSysdate(String scheSysdate) {
		this.scheSysdate = scheSysdate;
	}

	@Override
	public String toString() {
		return "ScheModelVO [scheTitle=" + scheTitle + ", scheDeadline=" + scheDeadline + ", scheOfficialCheck="
				+ scheOfficialCheck + ", scheTodo=" + scheTodo + ", scheWithWhom=" + scheWithWhom + ", scheToWhere=" + scheToWhere
				+ ", scheSysdate=" + scheSysdate + "]";
	}

}

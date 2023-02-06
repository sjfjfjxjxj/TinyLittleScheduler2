package schedule.service;

import java.sql.Connection;
import java.util.List;

import common.JDBCTemplate;
import member.model.vo.Member;
import schedule.model.dao.ScheduleDAO;
import schedule.model.vo.Schedule;

public class ScheduleService {
	private ScheduleDAO scheDao;
	public ScheduleService() {
		scheDao = new ScheduleDAO();
	}

	public List<Schedule> selectAllSchedule(String memId) {
		Connection conn = JDBCTemplate.getConnection();
		List<Schedule> scheList = scheDao.sellectAllSchedule(conn, memId);
		return scheList;
	}

}

package com.eomcs.lms.handler;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberDetailCommand extends  AbstractCommand {

	MemberDao memberDao;

	public MemberDetailCommand(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public void execute(Response response) throws Exception {
			
			int no = response.requestInt("번호?");

			Member member = memberDao.findByNo(no);
			if (member == null) {
				response.println("해당 번호의 사람 없당");
			}

			response.println(String.format("이름: %s", member.getName()));
			response.println(String.format("이메일: %s", member.getEmail()));
			response.println(String.format("암호: %s", member.getPassword()));

	}
}

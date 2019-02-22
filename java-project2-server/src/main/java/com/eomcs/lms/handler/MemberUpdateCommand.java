package com.eomcs.lms.handler;
import com.eomcs.lms.dao.MemberDao;
import com.eomcs.lms.domain.Member;

public class MemberUpdateCommand extends  AbstractCommand {

	MemberDao memberDao;

	public MemberUpdateCommand(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public void execute(Response response) throws Exception {

			Member member = new Member();


			member.setNo(response.requestInt("번호?"));

			member.setName(response.requestString("이름?"));

			member.setEmail(response.requestString("이메일?"));

			
			member.setPassword(response.requestString("비밀번호?"));


			if(memberDao.update(member) == 0) {
				response.println("해당 게시물이 없습니다.");
				return;
			}
			response.println("변경했습니다.");
			
	}
}

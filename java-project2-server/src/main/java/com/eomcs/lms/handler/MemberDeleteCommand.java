package com.eomcs.lms.handler;
import com.eomcs.lms.dao.MemberDao;

public class MemberDeleteCommand extends  AbstractCommand {

	MemberDao memberDao;

	public MemberDeleteCommand(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public void execute(Response response) throws Exception {
		
			int no = response.requestInt("번호?");
			
			if( memberDao.delete(no)==0) {
				response.println("xxxxxxxx");

				return;
			}
			response.println("삭제완료");
	}
}

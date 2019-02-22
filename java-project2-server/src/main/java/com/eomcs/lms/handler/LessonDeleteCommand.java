package com.eomcs.lms.handler;
import com.eomcs.lms.dao.LessonDao;

public class LessonDeleteCommand extends  AbstractCommand {

	LessonDao lessonDao;

	public LessonDeleteCommand(LessonDao lessonDao) {
		this.lessonDao = lessonDao;
	}


	@Override
	public void execute(Response response) throws Exception{
		int no =response.requestInt("번호?");

		if(lessonDao.delete(no)==0) {
			response.println("없어");
			return;
		}
	}
}

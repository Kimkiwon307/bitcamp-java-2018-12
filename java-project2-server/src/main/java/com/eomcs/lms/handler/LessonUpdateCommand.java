package com.eomcs.lms.handler;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateCommand extends  AbstractCommand {

	LessonDao lessonDao;

	public LessonUpdateCommand(LessonDao lessonDao) {
		this.lessonDao = lessonDao;
	}


	@Override
	public void execute(Response response) throws Exception {
			Lesson lesson = new Lesson();

			lesson.setNo(response.requestInt("번호?"));

			lesson.setTitle(response.requestString("제목?"));

			lesson.setContents(response.requestString("내용?"));

			lesson.setStartDate(response.requestDate("시작일?"));

			lesson.setEndDate(response.requestDate("종료일?"));

			lesson.setTotalHours(response.requestInt("총수업시간?"));

			lesson.setDayHours(response.requestInt("일수업시간?"));

			lessonDao.update(lesson);

			response.println("변경했습니다.");

	}
}

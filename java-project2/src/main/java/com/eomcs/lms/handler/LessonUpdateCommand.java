package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonUpdateCommand implements Command {

	Scanner keyboard;
	LessonDao lessonDao;

	public LessonUpdateCommand(Scanner keyboard, LessonDao lessonDao) {
		this.keyboard = keyboard;
		this.lessonDao = lessonDao;
	}


	@Override
	public void execute() {
		try {
			Lesson lesson = new Lesson();

			System.out.print("번호? ");
			lesson.setNo(Integer.parseInt(keyboard.nextLine()));

			System.out.printf("수업명? ");
			lesson.setTitle(keyboard.nextLine());

			System.out.printf("설명? ");
			lesson.setContents(keyboard.nextLine());

			System.out.printf("시작일? ");
			lesson.setStartDate(Date.valueOf(keyboard.nextLine()));

			System.out.printf("종료일? ");
			lesson.setEndDate(Date.valueOf(keyboard.nextLine()));

			System.out.printf("총수업시간? ");
			lesson.setTotalHours(Integer.parseInt(keyboard.nextLine()));

			System.out.printf("일수업시간? ");
			lesson.setDayHours(Integer.parseInt(keyboard.nextLine()));


			System.out.println("변경했습니다.");

		} catch (Exception e) {
			System.out.printf("실행 오류! : %s\n", e.getMessage());
		}
	}
}

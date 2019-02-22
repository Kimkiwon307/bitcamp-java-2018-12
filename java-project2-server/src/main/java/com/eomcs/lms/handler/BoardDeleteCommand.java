package com.eomcs.lms.handler;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import com.eomcs.lms.dao.BoardDao;

public class BoardDeleteCommand extends AbstractCommand {

	BoardDao boardDao;

	public BoardDeleteCommand(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public void execute(Response response) throws Exception {

		int no = response.requestInt("번호");

		if(boardDao.delete(no)==0) {
			response.println("해당 번호 게시물 없어");
			return;
		}

		response.println("삭제했습니다.");
	}
}

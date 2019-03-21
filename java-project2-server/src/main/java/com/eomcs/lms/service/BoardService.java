package com.eomcs.lms.service;

import java.util.List;

import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Member;

public interface BoardService {
	List<Board> list();
	int add(Board board);
	Board get(int no);
	int update(Board board);
	int delete(int no);
}

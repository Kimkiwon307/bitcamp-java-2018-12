package com.eomcs.lms.dao;

import java.util.List;

import com.eomcs.lms.domain.PhotoFile;

public interface PhotoFileDao {
	void insert(PhotoFile photoFile);
	List<PhotoFile> findByPhotoBoardNo(int photoBoardNo);
	//	PhotoBoard findByNo(int no);
	//	  int update(PhotoBoard photoBoard);
	//	 int delete(int no);

	//유지보수할때 테스트할것만 빼고 다주석처리
}

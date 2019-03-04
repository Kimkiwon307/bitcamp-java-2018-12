package com.eomcs.lms.handler;
import com.eomcs.lms.dao.PhotoBoardDao;

public class PhotoBoardDeleteCommand extends AbstractCommand {
  
	PhotoBoardDao photoboardDao;
  
  public PhotoBoardDeleteCommand(PhotoBoardDao photoboardDao) {
    this.photoboardDao = photoboardDao;
  }

  @Override
  public void execute(Response response) throws Exception {
    int no = response.requestInt("번호?");

    if (photoboardDao.delete(no) == 0) {
      response.println("해당 번호의 게시물이 없습니다.");
      return;
    }
    response.println("사진을 삭제했습니다.");
  }
}

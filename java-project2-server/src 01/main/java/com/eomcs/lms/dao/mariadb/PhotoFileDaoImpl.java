package com.eomcs.lms.dao.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.lms.domain.PhotoFile;

public class PhotoFileDaoImpl implements PhotoFileDao{

	// 외부에서 커넥션 객체를 주입 받는다.
	Connection con;

	public PhotoFileDaoImpl(Connection con) {
		this.con = con;
	}

	@Override
	public List<PhotoFile> findByPhotoBoardNo(int photoBoardNo) {
		try (PreparedStatement stmt = con.prepareStatement(
				"select photo_file_id, photo_id, file_path  "
						+ " from lms_photo_file "
						+ " where photo_id = ? "
						+ " order by photo_file_id asc")) {

			stmt.setInt(1,  photoBoardNo); // 특정 사진 게시물에 대해 첨부파일을 가져오기

			try (ResultSet rs = stmt.executeQuery()) {

				ArrayList<PhotoFile> list = new ArrayList<>();
				while (rs.next()) {
					PhotoFile photofile = new PhotoFile();
					photofile.setNo(rs.getInt("photo_id"));
					photofile.setPhotoBoardNo(rs.getInt("photo_id"));
					photofile.setFilePath(rs.getString("file_path"));

					list.add(photofile);
				}
				return list;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void insert(PhotoFile photoFile) {
		try (PreparedStatement stmt = con.prepareStatement(
				"insert into lms_photo_file(file_path,photo_id) values(?,?)")) {

			stmt.setString(1, photoFile.getFilePath());
			stmt.setInt(2,  photoFile.getPhotoBoardNo());
			stmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	//	public PhotoBoard findByNo(int no) {
	//		try {
	//			// 조회수 증가시키기
	//			try (PreparedStatement stmt = con.prepareStatement(
	//					"update lms_photo set vw_cnt = vw_cnt + 1 where photo_id = ?")) {
	//				stmt.setInt(1, no);
	//				stmt.executeUpdate();
	//			}
	//
	//			try (PreparedStatement stmt = con.prepareStatement(
	//					"select photo_id, titl, cdt, vw_cnt, lesson_id from lms_photo "
	//					+ " where photo_id = ?")) {
	//
	//				stmt.setInt(1, no);
	//
	//				try (ResultSet rs = stmt.executeQuery()) {
	//
	//					if (rs.next()) {
	//						PhotoBoard photoboard = new PhotoBoard();
	//						photoboard.setNo(rs.getInt("board_id"));
	//						photoboard.setTitle(rs.getString("titl"));
	//						photoboard.setCreatedDate(rs.getDate("cdt"));
	//						photoboard.setViewCount(rs.getInt("vw_cnt"));
	//						photoboard.setLessonNo(rs.getInt("lesson_id"));
	//						return photoboard;
	//					} else {
	//						return null;
	//					}
	//				}
	//			}
	//		} catch (Exception e) {
	//			throw new RuntimeException(e);
	//		}
	//	}
	//
	//		  public int update(PhotoBoard board) {
	//		    try (PreparedStatement stmt = con.prepareStatement(
	//		        "update lms_photo set titl = ? where photo_id = ?")) {
	//	
	//		      stmt.setString(1, board.getTitle());
	//		      stmt.setInt(2, board.getNo());
	//	
	//		      return stmt.executeUpdate();
	//		    } catch (Exception e) {
	//		      throw new RuntimeException(e);
	//		    }
	//		  }
	//	
	//		  public int delete(int no) {
	//		    try (PreparedStatement stmt = con.prepareStatement(
	//		        "delete from lms_photo where photo_id = ?")) {
	//	
	//		      stmt.setInt(1, no);
	//	
	//		      return stmt.executeUpdate();
	//		    } catch (Exception e) {
	//		      throw new RuntimeException(e);
	//		    }
	//		  }
}

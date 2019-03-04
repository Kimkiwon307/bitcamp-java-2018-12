package com.eomcs.lms.domain;

import java.io.Serializable;
import java.sql.Date;

public class PhotoBoard  implements Serializable {
	private static final long serialVersionUID = 1L;
	// ddl 이랑 컬럼명 같게 하지 않는다.
	// 자바가 특정 dbms에 종속되게 하지 않는다. 
	// 백업을 위해 보통 기업에서 serializable 적용
	private int no;
	private String title;
	private Date createdDate;
	private int viewCount;
	private int lessonNo;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getLessonNo() {
		return lessonNo;
	}
	public void setLessonNo(int lessonNo) {
		this.lessonNo = lessonNo;
	}


}

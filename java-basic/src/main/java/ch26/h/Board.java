package ch26.h;

import java.sql.Date;
import java.util.List;

public class Board {
private int no ;
private String title;
private String contents;
private Date created_date;
private int view_count;

private List<AttachFile> attachFiles;


@Override
public String toString() {
	return "Board [no=" + no + ", title=" + title + ", contents=" + contents + ", created_date=" + created_date
			+ ", view_count=" + view_count + "]";

}
public List<AttachFile> getAttachFiles() {
	return attachFiles;
}
public void setAttachFiles(List<AttachFile> attachFiles) {
	this.attachFiles = attachFiles;
}
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
public String getContents() {
	return contents;
}
public void setContents(String contents) {
	this.contents = contents;
}
public Date getCreated_date() {
	return created_date;
}
public void setCreated_date(Date created_date) {
	this.created_date = created_date;
}
public int getView_count() {
	return view_count;
}
public void setView_count(int view_count) {
	this.view_count = view_count;
}


}

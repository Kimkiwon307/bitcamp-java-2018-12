package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Lesson;

public class LessonTest {

  ObjectInputStream in ;
  ObjectOutputStream out ;

  public LessonTest(ObjectInputStream in,ObjectOutputStream out) {
    this.in = in;
    this.out = out;
  }

  public void test() throws Exception {

    add(new Lesson(1,"자바프로그래밍"));
    add(new Lesson(2,"노드프로그래밍"));

//    detail(1);
//
//    update(new Lesson(1,"홍길동s"));
//
//    detail(1);
//
//    delete(2);

    list();

  }
  private void add(Lesson lesson) throws Exception {
    out.writeUTF("/lesson/add");
    out.flush();
    if(!in.readUTF().equals("OK"))
      return;
    out.writeObject(lesson);
    out.flush();


    String status = in.readUTF();

    if(status.equals("OK"))
      System.out.println("데이터 추가 성공!");
    else 
      System.out.println("데이터 추가 실패!");
  }

  private void list() throws Exception {
    out.writeUTF("/lesson/list");
    out.flush();
    if(!in.readUTF().equals("OK"))
      return;

    String status = in.readUTF();

    if(!status.equals("OK")) {
      System.out.println("데이터 목록 가져오기 실패");
      return;
    }

    @SuppressWarnings("unchecked")
    List<Lesson> lessons = (List<Lesson>) in.readObject();
    for(Lesson l : lessons) {
      System.out.println(l);
    }
  }
  private void detail(int no) throws Exception{
    out.writeUTF("/lesson/detail");
    out.flush();
    if(!in.readUTF().equals("OK"))
      return;
    out.writeInt(no);
    out.flush();
    String status = in.readUTF();

    if(!status.equals("OK")) {
      System.out.println("데이터 가져오기 실패");
      return;
    }

    Lesson lesson = (Lesson)in.readObject();
    System.out.println(lesson);
  }
  private void update(Lesson lesson) throws Exception{
    out.writeUTF("/lesson/update");
    out.flush();
    if(!in.readUTF().equals("OK"))
      return;
    out.writeObject(lesson);
    out.flush();

    String status = in.readUTF();

    if(status.equals("OK"))
      System.out.println("데이터 갱신 성공!");
    else 
      System.out.println("데이터 갱신 실패!");

  }
  private  void delete(int no)throws Exception{
    out.writeUTF("/lesson/delete");
    out.flush();
    if(!in.readUTF().equals("OK"))
      return;
    out.writeInt(no);
    out.flush();

    String status = in.readUTF();

    if(status.equals("OK"))
      System.out.println("데이터 삭제 성공!");
    else 
      System.out.println("데이터 삭제 실패!");

  }



}

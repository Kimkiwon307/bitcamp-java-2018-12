// 2단계 클라이언트의 연결을 승인한다.
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.eomcs.lms.domain.Lesson;

public class LessonService {

  static ArrayList<Lesson> lessons = new ArrayList<>();
  static ObjectInputStream in ;
  static ObjectOutputStream out;

   LessonService(ObjectInputStream in,ObjectOutputStream out){
     this.in = in;
     this.out = out;
   }
  public  void excute(String request) throws Exception{

    switch(request) {
      case "/lesson/add" : 
        add();
        break;
      case "/lesson/list" :
        list();
        break;
      case "/lesson/detail" :
        detail();
        break;
      case "/lesson/update" :
        update();
        break;
      case "/lesson/delete" :
        delete();
        break;
      default :
        out.writeUTF("FAIL");
        break;
    }
    out.flush();
  }



  private void add() throws Exception {
    out.writeUTF("OK");
    out.flush();
    lessons.add((Lesson)in.readObject());
    out.writeUTF("OK");

  }
  private void list() throws Exception {
    out.writeUTF("OK");
    out.flush();
    out.writeUTF("OK");
    out.writeObject(lessons);

  }
  private void detail()throws Exception{
    out.writeUTF("OK");
    out.flush();
    int no = in.readInt();

    for (Lesson m : lessons) {
      if(m.getNo() == no) {
        out.writeUTF("OK");
        out.writeObject(m);
        return;
      }
    }

    out.writeUTF("FAIL");
  }
  private void update()throws Exception{
    out.writeUTF("OK");
    out.flush();
    Lesson lesson = (Lesson)in.readObject();

    int index = 0;
    for (Lesson m : lessons) {
      if(m.getNo() == lesson.getNo()) {

        lessons.set(index, lesson);
        out.writeUTF("OK");
        return;
      }
      index ++;
    }
    out.writeUTF("FAIL");
  }
  private void delete()throws Exception{
    out.writeUTF("OK");
    out.flush();


    int no = in.readInt();
    int index = 0;
    for (Lesson m : lessons) {
      if(m.getNo() == no) {
        lessons.remove(index);
        out.writeUTF("OK");
        return;
      }
      index++;
    }

    out.writeUTF("FAIL");

  }

}

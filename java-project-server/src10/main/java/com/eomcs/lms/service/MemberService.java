// 2단계 클라이언트의 연결을 승인한다.
package com.eomcs.lms.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;

public class MemberService {
  
  String filepath;
  List<Member> members ;
  ObjectInputStream in ;
  ObjectOutputStream out;

  public void init(ObjectInputStream in ,ObjectOutputStream out){
    this.in =in;
    this.out = out;
  }
  @SuppressWarnings("unchecked")
  public void loadData( String filepath) throws Exception {
    this.filepath = filepath;
    try (ObjectInputStream in = new ObjectInputStream(
        new BufferedInputStream(
            new FileInputStream(this.filepath)))) {
      members =(List<Member>) in.readObject();

    } catch (Exception e) {
      members =  new ArrayList<Member>();
      throw new Exception("멤버 파일 로딩 오류 발생: " , e);
    }


  }
  public void saveData() throws Exception {
    try (ObjectOutputStream out = new ObjectOutputStream(
        new BufferedOutputStream(
            new FileOutputStream(this.filepath)))) {

      out.writeObject(members);

    } catch (Exception e) {
      throw new Exception("멤퍼 파일 저장 오류 발생: " , e);
    }
  }

  public  void excute(String request) throws Exception{

    switch(request) {
      case "/member/add" : 

        add();
        break;
      case "/member/list" :
        list();
        break;
      case "/member/detail" :
        detail();
        break;
      case "/member/update" :
        update();
        break;
      case "/member/delete" :
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
    members.add((Member)in.readObject());
    out.writeUTF("OK");

  }
  private void list() throws Exception {
    out.writeUTF("OK");
    out.flush();
    out.writeUTF("OK");
    out.writeObject(members);


  }
  private void detail()throws Exception{
    out.writeUTF("OK");
    out.flush();
    int no = in.readInt();

    for (Member m : members) {
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
    Member member = (Member)in.readObject();

    int index = 0;
    for (Member m : members) {
      if(m.getNo() == member.getNo()) {

        members.set(index, member);
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
    for (Member m : members) {
      if(m.getNo() == no) {
        members.remove(index);
        out.writeUTF("OK");
        return;
      }
      index++;
    }

    out.writeUTF("FAIL");

  }

}

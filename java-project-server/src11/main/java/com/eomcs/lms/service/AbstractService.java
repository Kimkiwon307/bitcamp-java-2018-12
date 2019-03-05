// 
package com.eomcs.lms.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.domain.Board;

public abstract class AbstractService<E> {

  List<E> list ;
  ObjectInputStream in ;
  ObjectOutputStream out;
  String filepath;

  public void init(ObjectInputStream in,ObjectOutputStream out) throws Exception{
    this.in = in;
    this.out = out;
  }
  @SuppressWarnings("unchecked")
  public void loadData( String filepath) throws Exception {
    this.filepath = filepath;
    try (ObjectInputStream in = new ObjectInputStream(
        new BufferedInputStream(
            new FileInputStream(this.filepath)))) {
      list =(List<E>) in.readObject();

    } catch (Exception e) {
      list =  new ArrayList<E>();
      throw new Exception("데이터 파일 로딩 오류 발생: " , e);
    }
  }
  public void saveData() throws Exception {
    try (ObjectOutputStream out = new ObjectOutputStream(
        new BufferedOutputStream(
            new FileOutputStream(this.filepath)))) {

      out.writeObject(list);

    } catch (Exception e) {
      throw new Exception("데이터 파일 저장 오류 발생: " , e);
    }
  }
 public abstract void excute(String request) throws Exception;
  
  }


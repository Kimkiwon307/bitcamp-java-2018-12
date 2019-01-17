package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.handler.*;
public class LessonList {
  
  static final int LENGTH = 10;
  Lesson[] lessons;
  int lessonIdx = 0;

  public void add(Lesson i) {
      if (lessonIdx >= lessons.length) {
        int oldCapacity = lessons.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        lessons = Arrays.copyOf(lessons, newCapacity);
      }
  }
  
  public Lesson[] toArray() {
    return Arrays.copyOf(lessons,lessonIdx);
    
  }
    
  }


package algorithm.data_structure.linkedlist;

import static org.junit.Assert.*;
import org.junit.Test;

public class linkedlist2Test {

  @Test
  public void testAdd() {
   linkedlist2 list = new linkedlist2();
   
   list.add(100);
   list.add(200);
   list.add(300);
   list.add(400);
   list.add(500);
   list.add(600);
   assertEquals(6, list.size());
   
  }

  @Test
  public void testGet() {
    fail("Not yet implemented");
  }

  @Test
  public void testSet() {
    fail("Not yet implemented");
  }
  @Test
  public int size() {
    return size;
  }

 

}

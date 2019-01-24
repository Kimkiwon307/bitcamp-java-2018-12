//제네릭 적용

package algorithm.data_structure.queue2;

import algorithm.data_structure.linkedlist3.LinkedList;
import algorithm.data_structure.linkedlist.Node;

//
public class Queue<E> extends LinkedList<E> {

public void offer(E value) {
 this.add(value);
}

public E poll() {
 return this.remove(0);
}

public boolean empty() {
 return this.size == 0;
}
}

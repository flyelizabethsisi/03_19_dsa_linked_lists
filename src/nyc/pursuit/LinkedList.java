package nyc.pursuit;

import java.util.ArrayList;

public class LinkedList {

  LinkedListNode head;
  private int size;

  public LinkedList(LinkedListNode head) {
    this.head = head;
    size = 1;
  }

  public int getSize() {
    return size;
  }

  /**
   * This method takes in a number and adds a node to the end of a list
   *
   * @param element : number that is passed in, build a linked list node out of this
   */
  public void append(int element) {
    LinkedListNode temp = new LinkedListNode(element);
    LinkedListNode current = head;
    if (head == null) {
      head = temp;
      size++;
      return;
    }

    // loop through all the links in the list
    while (current.next != null) {
      current = current.next;
    }

    current.next = temp;
    size++;
  }

  /**
   * This method takes in a number and adds it to the beginning of the linked list
   *
   * @param element: number that is passed in, build a linkedlistnode out of this number
   */

  public void prepend(int element) {
    LinkedListNode temp = new LinkedListNode(element);
    temp.next = head;
    head = temp;
    size++;
  }

  public void delete(int value) {
    LinkedListNode temp = head;
    LinkedListNode prev = temp;

    if (head.data == value) {
      head = head.next;
      size--;
      return;
    }

    while (temp != null && temp.data != value) {
      prev = temp;
      temp = temp.next;
    }

    if (temp != null) {
      prev.next = temp.next;
      size--;
    }
  }

  /**
   * This method prints out each node inside of my linked list
   */
  public void print() {
    LinkedListNode current = head;

    while (current != null) {
      System.out.print(current.data + " ---> ");
      current = current.next;
    }
    System.out.println(" NULL\n");
  }

}

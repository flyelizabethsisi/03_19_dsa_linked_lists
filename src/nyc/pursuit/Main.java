package nyc.pursuit;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    int[] arr = {7, 15, 9, 21, 8, 4};

    List<List<int[][]>> listofArrays;
    System.out.println(arr);
    LinkedListNode head = new LinkedListNode(5);
    System.out.println(head);
    System.out.println(head.data);
//    System.out.println(head.next);
//    head.next = new LinkedListNode(10);
//    System.out.println(head.next);
//    System.out.println(head.next.data);

    LinkedList myList = new LinkedList(head);
    myList.append(7);
    myList.print();
    myList.prepend(100);
    myList.append(7);
    myList.print();
    myList.delete(7);
    myList.print();
    System.out.println(myList.getSize());
    myList.delete(5);
    myList.print();
    System.out.println(myList.getSize());
    myList.print();
    myList.delete(100);
    myList.print();
    System.out.println(myList.getSize());
  }

  private static int[] addElement(int[] arr, int x) {
    int arrSize = arr.length;
    int[] arrayArray = new int[arrSize + 1];

    for (int i = 0; i < arr.length; i++) {
      arrayArray[i] = arr[i];
    }

    arrayArray[arrayArray.length - 1] = x;

    bigEnough();

    return arrayArray;
  }

  private static void bigEnough() {
    int[] arr = new int[10];
    arr[0] = 1;
    arr[1] = 12;
    arr[2] = 123;
    arr[3] = 1234;
    arr[4] = 12345;
    System.out.println(Arrays.toString(arr));
    int[] example = {1, 2, 4, 5, 76, 3232, 134, 0, 0, 0, 0, 0, 0, 0, 0};
  }

  private static int[] removeElement(int[] arr, int index) {
    int[] newArr = new int[arr.length - 1];
    int i = 0;
    int j = 0;

    while (i < index) {
      newArr[i] = arr[i];
      i++;
      j++;
    }

    while (i >= index && j < newArr.length) {
      if (i == index) {
        i++;
      }
      newArr[j] = arr[i];
      i++;
      j++;
    }

    return newArr;
  }

  public static int[] removeSomething(int[] arr, int index) {
    int[] newArr = new int[arr.length - 1];
    int j = 0;

    for (int i = 0; i < newArr.length; i++) {
      if (j == index) {
        j++;
      }
      newArr[i] = arr[j];
      j++;
    }
    return newArr;
  }
}

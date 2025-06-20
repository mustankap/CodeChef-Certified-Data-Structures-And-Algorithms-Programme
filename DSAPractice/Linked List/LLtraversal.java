class Node {

  int data;
  Node next;

  Node(int data1, Node next1) {
    this.data = data1;
    this.next = next1;
  }

  Node(int data1) {
    this.data = data1;
    next = null;
  }
}

public class LLtraversal {

  public static void main(String[] args) {
    int arr[] = { 2, 4, 5, 5, 6 };
    Node head = convertArrtoLL(arr);
    System.out.println(head.data);
  }

  public static Node convertArrtoLL(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node nd = new Node(arr[i]);
      mover.next = nd;
      mover = nd;
    }

    return head;
  }
}

import java.util.*;

public class Inorder {

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);

    List<Integer> result = inOrder(root);

    System.out.println(result.toString());
  }

  static List<Integer> inOrder(Node root) {
    List<Integer> arr = new ArrayList<>();

    inorder(root, arr);
    return arr;
  }

  public static void inorder(Node root, List<Integer> arr) {
    if (root == null) return;

    inorder(root.left, arr);

    arr.add(root.data);
    inorder(root.right, arr);
  }
}

class Node {

  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    left = null;
    right = null;
  }
}

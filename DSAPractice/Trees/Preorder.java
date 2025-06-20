import java.util.*;

public class Preorder {

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);

    List<Integer> result = preOrder(root);

    System.out.println(result.toString());
  }

  static List<Integer> preOrder(Node root) {
    List<Integer> arr = new ArrayList<>();

    preorder(root, arr);
    return arr;
  }

  public static void preorder(Node root, List<Integer> arr) {
    if (root == null) return;

    arr.add(root.data);

    preorder(root.left, arr);

    preorder(root.right, arr);
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

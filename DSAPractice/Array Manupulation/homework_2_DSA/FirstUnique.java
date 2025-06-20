import java.io.*;
import java.util.*;

/**
 * this is a java program which checks for duplicates in a stream using a hashmap
 *  and maintains a doubly linked list for the values
 *
 * To the the program first check you hava java and jdk installed
 * I use ubuntu 
 * openjdk version "11.0.22" 2024-01-16
OpenJDK Runtime Environment (build 11.0.22+7-post-Ubuntu-0ubuntu222.04.1)
OpenJDK 64-Bit Server VM (build 11.0.22+7-post-Ubuntu-0ubuntu222.04.1, mixed mode, sharing)
 * but this code will literally run anywhere on any java runtime.

 * next go the file location and open the terminal
 * type the following: javac <filename>.java
 * <filename.class> and <Node.class> will be created
 * to run type: java <filename>
 *
 *
 */
class Node { // class node is for each node

  int data, freq;
  Node next;
  Node prev;

  Node(int data1, Node prev1, Node next1) {
    this.next = next1;
    this.data = data1;
    this.prev = prev1;
  }

  Node(int data1) {
    this.data = data1;
    this.prev = null;
    this.next = null;
    this.freq = 0;
  }
}

public class FirstUnique {

  //the constrcutor is for the already set stream present on which we will add or delete
  FirstUnique(int[] arr) {
    if (arr.length > 0) {
      for (int i = 0; i < arr.length; i++) {
        add(arr[i]);
      }
    }
  }

  //global variables of standard input and head tail of our doubly linkedlist
  BufferedReader br;
  StringTokenizer st;
  Map<Integer, Node> mp = new HashMap<Integer, Node>();
  Node head;
  Node tail;
  int n;

  //takes input as a string and parses each space into a different integer in our stream
  //you can ignore these
  int nextInt() throws IOException {
    return Integer.parseInt(next());
  }

  String next() throws IOException {
    while (st == null || !st.hasMoreTokens()) {
      st = new StringTokenizer(br.readLine());
    }
    return st.nextToken();
  }

  //main method
  public static void main(String args[]) throws IOException {
    FirstUnique h = new FirstUnique(new int[] { 1 }); //you can insert any list from autograder to specify the list already present
    h.br = new BufferedReader(new InputStreamReader(System.in));
    //input
    h.input();

    h.br.close();
  }

  public void input() throws IOException {
    while (true) {
      int n = nextInt();
      if (n < 0) break; //breaks only if you insert a negative integer
      add(n); //add values in O(1)

      System.out.println(showFirstUnique()); //shows the first unique element in O(1)
    }
  }

  public void add(int n) {
    Node newNode = mp.get(n);

    if (newNode == null) { // Number not present in hashmap
      newNode = new Node(n); //create a new node
      mp.put(n, newNode); //add it to the hashmap
      newNode.freq = 1; //update the frequency
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
      }
    } else { // Number already present
      newNode.freq += 1; //update the frequency
      if (head != null) remove(mp.get(n)); //remove it from the list of uniqueoccurences
    }
    //uncomment the below function just for a nice visual of what has happened
    //print();
  }

  // Function to remove a node from the list
  public void remove(Node foundNode) {
    if (foundNode == head) {
      head = foundNode.next;
    } else if (foundNode == tail) {
      tail = foundNode.prev;
    } else {
      foundNode.prev.next = foundNode.next;
      foundNode.next.prev = foundNode.prev;
    }
  }

  public int showFirstUnique() {
    if (head != null) return head.data; else return -1;
  }

  public void print() {
    System.out.println("The doubly linked list:");
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    if (temp == null) System.out.println("null");

    System.out.println("the hashmap:");
    for (Map.Entry<Integer, Node> mapElement : mp.entrySet()) {
      int key = mapElement.getKey();

      int value = (mapElement.getValue().freq);

      System.out.println("[" + key + " : " + value + "],");
    }
  }
}

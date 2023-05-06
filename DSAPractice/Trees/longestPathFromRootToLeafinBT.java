/*
Time complexity: O(N) 
Auxiliary Space: O(N)

*/
// Java program to print Longest Path
// from root to leaf in a Binary tree
import java.io.*;
import java.util.ArrayList;

class longestPathFromRootToLeafinBT {

    // Binary tree node
    static class Node {
        Node left;
        Node right;
        int data;
    };

    // Function to create a new
    // Binary node
    // this can even be a constructor in above Node class
    static Node newNode(int data) {
        Node temp = new Node();

        temp.data = data;
        temp.left = null;
        temp.right = null;

        return temp;
    }

    // Function to find and return the
    // longest path
    public static ArrayList<Integer> longestPath(Node root) {

        // If root is null means there
        // is no binary tree so
        // return a empty vector
        if (root == null) {
            ArrayList<Integer> output = new ArrayList<>();
            return output;
        }

        // Recursive call on root.right
        ArrayList<Integer> right = longestPath(root.right);

        // Recursive call on root.left
        ArrayList<Integer> left = longestPath(root.left);

        // Compare the size of the two ArrayList
        // and insert current node accordingly
        if (right.size() < left.size()) {
            left.add(root.data);
        } else {
            right.add(root.data);
        }

        // Return the appropriate ArrayList
        return (left.size() > right.size() ? left : right);
    }

    // Driver Code
    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.left.right.right = newNode(6);

        ArrayList<Integer> output = longestPath(root);
        int n = output.size();

        System.out.print(output.get(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(" -> " + output.get(i));
        }
    }
}


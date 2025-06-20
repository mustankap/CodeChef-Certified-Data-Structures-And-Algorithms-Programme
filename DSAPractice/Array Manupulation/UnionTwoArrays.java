import java.io.*;
import java.util.*;

public class UnionTwoArrays {

  static BufferedReader br;
  static StringTokenizer st;

  static int nextInt() throws IOException {
    return Integer.parseInt(next());
  }

  static String next() throws IOException {
    while (st == null || !st.hasMoreTokens()) {
      st = new StringTokenizer(br.readLine());
    }
    return st.nextToken();
  }

  static long nextLong() throws IOException {
    return Long.parseLong(next());
  }

  public static void main(String args[]) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    int t = nextInt();
    while (t-- > 0) {
      input();
    }
    br.close();
  }

  public static void input() throws IOException {
    int n = nextInt();
    int n1 = nextInt();

    int arr1[] = new int[n];
    int arr2[] = new int[n1];
    for (int i = 0; i < n; i++) arr1[i] = nextInt();
    for (int i = 0; i < n1; i++) arr2[i] = nextInt();

    System.out.println(sortedArray(arr1, arr2));
  }

  public static List<Integer> sortedArray(int[] arr1, int[] arr2) {
    // Write your code here
    int n = arr1.length;
    int m = arr2.length;
    int i = 0, j = 0; // pointers
    List<Integer> Union = new ArrayList<>(); // Union vector
    while (i < n && j < m) {
      if (arr1[i] <= arr2[j]) { // Case 1 and 2
        if (
          Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]
        ) Union.add(arr1[i]);
        i++;
      } else { // case 3
        if (
          Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]
        ) Union.add(arr2[j]);
        j++;
      }
    }
    while (i < n) { // IF any element left in arr1
      if (Union.get(Union.size() - 1) != arr1[i]) Union.add(arr1[i]);
      i++;
    }
    while (j < m) { // If any elements left in arr2
      if (Union.get(Union.size() - 1) != arr2[j]) Union.add(arr2[j]);
      j++;
    }
    return Union;
  }
}

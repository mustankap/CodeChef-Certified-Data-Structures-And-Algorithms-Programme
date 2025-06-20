import java.io.*;
import java.util.*;

public class removeDuplicates {

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
    List<Integer> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arr.add(nextInt());
    }
    System.out.println(removeDuplicatess(arr, n));
  }

  public static int removeDuplicatess(List<Integer> arr, int n) {
    // Write your code here.
    int i = 0;
    for (int j = 1; j < n; j++) {
      System.out.println("new value of j:" + j + " new value of i:" + i);
      if (arr.get(i) != arr.get(j)) {
        System.out.println("arr[i] != arr[j]");
        System.out.println("Value of i is:" + i);
        System.out.println("value of j is:" + j);
        int u = arr.get(i + 1);
        System.out.println(
          "we will replace a[i+1] = " +
          arr.get(i + 1) +
          " with arr[j] = " +
          arr.get(j)
        );
        int v = arr.get(j);
        arr.set(u, v);
        i++;
        System.out.println("Value of i after increament is:" + i);

        System.out.println("The array now:" + arr);
      }
    }

    return i + 1;
  }
}

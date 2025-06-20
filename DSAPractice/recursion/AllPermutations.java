import java.io.*;
import java.util.*;

public class AllPermutations {

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
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = nextInt();
    }
    System.out.println(permute(arr));
  }

  public static List<List<Integer>> permute(int[] arr) {
    List<List<Integer>> ans = new ArrayList<>();
    recurPermute(0, arr, ans);

    return ans;
  }

  public static void recurPermute(int ind, int[] arr, List<List<Integer>> ans) {
    if (ind == arr.length) {
      List<Integer> ds = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
        ds.add(arr[i]);
      }
      ans.add(ds);
      return;
    }
    for (int i = ind; i < arr.length; i++) {
      swap(i, ind, arr);
      recurPermute(ind + 1, arr, ans);
      swap(i, ind, arr);
    }
  }

  public static void swap(int d, int s, int[] arr) {
    int c = 0;
    c = arr[d];
    arr[d] = arr[s];
    arr[s] = c;
  }
}

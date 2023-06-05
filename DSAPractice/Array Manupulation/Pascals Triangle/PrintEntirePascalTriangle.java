import java.io.*;
import java.util.*;

public class PrintEntirePascalTriangle {

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
    input();
    br.close();
  }

  public static void input() throws IOException {
    int n = nextInt();
    System.out.println(generate(n));
  }

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();

    for (int i = 0; i <= numRows; i++) {
      List<Integer> ds = new ArrayList<>();
      int val = 1;
      for (int c = 0; c < i; c++) {
        if (c == 0) {
          val = 1;
          ds.add(1);
        } else {
          val = (val * (i - c)) / c;
          ds.add(val);
        }
      }
      if (i != 0) ans.add(new ArrayList<>(ds)); else continue;
    }
    return ans;
  }
}

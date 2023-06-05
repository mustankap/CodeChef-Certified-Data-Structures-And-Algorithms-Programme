import java.io.*;
import java.util.*;

public class RowOfPascal {

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
    getRow(n);
  }

  public static void getRow(int n) {
    int ans = 1;
    for (int i = 0; i < n; i++) {
      if (i == 0) System.out.print(1 + " "); else {
        ans = (ans * (n - i)) / i;
        System.out.print(ans + " ");
      }
    }
  }
}

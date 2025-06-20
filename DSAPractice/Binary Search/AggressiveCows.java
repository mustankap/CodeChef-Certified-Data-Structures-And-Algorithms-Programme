import java.io.*;
import java.util.*;

public class AggressiveCows {

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
    int c = nextInt();
    int stalls[] = new int[n];
    for (int i = 0; i < n; i++) {
      stalls[i] = nextInt();
    }

    Arrays.sort(stalls);
    int left = 0;
    int right = stalls[n - 1] - stalls[0];
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (canWePlace(mid, stalls, c, n) == true) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    System.out.println(right);
  }

  public static boolean canWePlace(int mid, int[] stalls, int c, int n) {
    int count = 1;
    int lastCow = stalls[0];
    for (int i = 1; i < n; i++) {
      if (stalls[i] - lastCow >= mid) {
        count++;
        lastCow = stalls[i];
      }
      if (count >= c) {
        return true;
      }
    }
    return false;
  }
}

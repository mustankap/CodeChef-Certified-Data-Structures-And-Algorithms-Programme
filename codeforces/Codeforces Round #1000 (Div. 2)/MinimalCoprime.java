import java.io.*;
import java.util.*;

public class MinimalCoprime {

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
    long L = nextLong();
    long l = L;
    long R = nextLong();
    long r = R;
    while (l < r) {
      boolean res = checkCoprime(l, r);
      if (st.isEmpty()) {
        st.push(l, r);
      } else {
        continue;
      }
    }
  }
}
/**
 * 
 * 1,10
[1,1]coprime
[1,2]not coprime
[1,3]not coprime
[1,4]not coprime
[1,5]not coprime
[1,6]not coprime
[1,7]not coprime
[1,8]not coprime
[1,9]not coprime
[1,10]not coprime

2,2not coprime
2,3 co prime
2,4
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
2,
















 */

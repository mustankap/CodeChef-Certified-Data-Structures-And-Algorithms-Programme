import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class NoIfRowColumnGiven {

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
    // int r = nextInt();
    // int c = nextInt();
    BigInteger r = BigInteger.valueOf(nextInt());
    BigInteger c = BigInteger.valueOf(nextInt());

    System.out.println(
      getncr(r.subtract(BigInteger.ONE), c.subtract(BigInteger.ONE))
    );
  }

  //   public static int getncr(int r, int c) {
  //     int res = 1;
  //     for (int i = 0; i < c; i++) {
  //       res = res * (r - i);
  //       res = res / (i + 1);
  //     }

  //     return res;
  //   }
  public static BigInteger getncr(BigInteger r, BigInteger c) {
    BigInteger res = BigInteger.ONE;
    for (
      BigInteger i = BigInteger.ZERO;
      i.compareTo(c) < 0;
      i = i.add(BigInteger.ONE)
    ) {
      res = res.multiply(r.subtract(i));
      res = res.divide(i.add(BigInteger.ONE));
    }

    return res;
  }
}

import java.io.*;
import java.util.*;

public class SetMatrixZeroMarkIteration {

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
    int r = nextInt();
    int c = nextInt();
    int matrix[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        matrix[i][j] = nextInt();
      }
    }

    setZeros(matrix);

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void setZeros(int[][] matrix) {
    // Write your code here..
    int r[] = new int[matrix[0].length];
    int c[] = new int[matrix.length];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[j][i] == 0) {
          r[j] = 1;
          c[i] = 1;
        }
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (r[j] == 1 || c[i] == 1) {
          matrix[j][i] = 0;
        }
      }
    }
  }
}

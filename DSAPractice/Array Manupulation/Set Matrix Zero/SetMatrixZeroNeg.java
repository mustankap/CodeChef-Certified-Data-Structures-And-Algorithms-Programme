import java.io.*;
import java.util.*;

public class SetMatrixZeroNeg {

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

  public static void setZeros(int matrix[][]) {
    // Write your code here..
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          makeRCNeg(matrix, i, j);
        }
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] < 0) {
          matrix[i][j] = 0;
        }
      }
    }
  }

  public static void makeRCNeg(int[][] matrix, int i, int j) {
    for (int I = 0; I < matrix[0].length; I++) {
      if (matrix[i][I] != 0) {
        matrix[i][I] = -1;
      }
    }

    for (int I = 0; I < matrix.length; I++) {
      if (matrix[I][j] != 0) {
        matrix[I][j] = -1;
      }
    }
  }
}

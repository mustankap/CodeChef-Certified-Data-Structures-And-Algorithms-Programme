/** https://www.codingninjas.com/codestudio/problems/set-matrix-zeros_3846774?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0
 * Your time complexity: O(n^3)
 */

import java.io.*;
import java.util.*;

public class SetMatrixZeroUsingListToMarkZeroElement {

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

    List<List<Integer>> ewaz = new ArrayList<>();
    List<Integer> cr;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          cr = Arrays.asList(i, j);
          ewaz.add(cr);
        }
      }
    }

    makeEntireRowColumnZero(matrix, ewaz);
  }

  public static void makeEntireRowColumnZero(
    int[][] matrix,
    List<List<Integer>> ewaz
  ) {
    int r = 0, c = 0;

    for (List<Integer> rc : ewaz) {
      r = rc.get(0);
      c = rc.get(1);
      for (int i = 0; i < matrix[r].length; i++) {
        matrix[r][i] = 0;
      }

      for (int i = 0; i < matrix.length; i++) {
        matrix[i][c] = 0;
      }
    }
  }
}

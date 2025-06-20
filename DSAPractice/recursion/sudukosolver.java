import java.io.*;
import java.util.*;

class sudukosolver {

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
    char[][] board = {
      { '9', '5', '7', '.', '1', '3', '.', '8', '4' },
      { '4', '8', '3', '.', '5', '7', '1', '.', '6' },
      { '.', '1', '2', '.', '4', '9', '5', '3', '7' },
      { '1', '7', '.', '3', '.', '4', '9', '.', '2' },
      { '5', '.', '4', '9', '7', '.', '3', '6', '.' },
      { '3', '.', '9', '5', '.', '8', '7', '.', '1' },
      { '8', '4', '5', '7', '9', '.', '6', '1', '3' },
      { '.', '9', '1', '.', '3', '6', '.', '7', '5' },
      { '7', '.', '6', '1', '8', '5', '4', '.', '9' },
    };
    solve(board);
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static boolean solve(char board[][]) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          for (char a = '1'; a <= '9'; a++) {
            if (validate(i, j, board, a)) {
              board[i][j] = a;

              if (solve(board)) return true; else board[i][j] = '.';
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  public static boolean validate(int row, int col, char[][] board, char a) {
    for (int i = 0; i < 9; i++) {
      if (board[row][i] == a) return false;
      if (board[i][col] == a) return false;
      if (
        board[(3 * (row / 3)) + i / 3][(3 * (col / 3)) + i % 3] == a
      ) return false;
    }
    return true;
  }
}

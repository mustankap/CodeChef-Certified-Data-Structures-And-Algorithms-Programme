import java.io.*;
import java.util.*;

public class RotateBox {

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
    // char[][] box = {
    //   { '#', '#', '*', '.', '*', '.' },
    //   { '#', '#', '#', '*', '.', '.' },
    //   { '#', '#', '#', '.', '#', '.' },
    // };

    char[][] box = { { '#', '.', '*', '.' }, { '#', '#', '*', '.' } };

    // char[][] box = { { '#', '.', '#' } };

    char[][] result = rotateTheBox(box);
    for (char[] row : result) {
      System.out.println(Arrays.toString(row));
    }
  }

  public static char[][] rotateTheBox(char[][] box) {
    char[][] ans = transpose(box);

    for (int j = 0; j < ans[0].length; j++) {
      drop_stones(ans, j);
    }

    return ans;
  }

  public static void drop_stones(char[][] box, int col) {
    int i = box.length - 1;
    int j = box.length - 1;
    while (i >= 0) {
      if (j == i) {
        i--;
        continue;
      }

      if (box[j][col] == '.') {
        if (box[i][col] == '.') {
          i--;
          continue;
        }
        if (box[i][col] == '#') {
          char temp = box[j][col];
          box[j][col] = box[i][col];
          box[i][col] = temp;
          j--;
          continue;
        }
        if (box[i][col] == '*') {
          j = i;
          j--;
          i--;
          continue;
        }
      }
      if (box[j][col] == '#' || box[j][col] == '*') {
        if (box[i][col] == '.') {
          i--;
          j--;
          continue;
        }
        if (box[i][col] == '#' || box[i][col] == '*') {
          i--;
          j -= 2;
          continue;
        }
      }
    }
  }

  // int bottom = box.length - 1;
  // for (int i = box.length - 1; i >= 0; i--) {
  //   if (box[i][col] == '#') {
  //     if (i != bottom) {
  //       char temp = box[bottom][col];
  //       box[bottom][col] = box[i][col];
  //       box[i][col] = temp;
  //     }
  //     bottom--;
  //   } else if (box[i][col] == '*') {
  //     bottom = i - 1;
  //   }
  // }
  // }

  public static char[][] transpose(char[][] box) {
    char[][] res = new char[box[0].length][box.length];
    for (int i = 0; i < box.length; i++) {
      for (int j = 0; j < box[0].length; j++) {
        res[j][box.length - 1 - i] = box[i][j];
      }
    }
    return res;
  }
}

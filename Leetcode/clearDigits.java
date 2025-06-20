import java.io.*;
import java.util.*;

public class clearDigits {

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
    // String s = next();
    //System.out.println(cclearDigits(s));
    System.out.println(findWinningPlayer(new int[] { 4, 2, 6, 3, 9 }, 2));
    System.out.println(findWinningPlayer(new int[] { 2, 5, 4 }, 3));
  }

  public static String cclearDigits(String s) {
    char[] cl = s.toCharArray();
    if (Character.isDigit(cl[0])) cl[0] = ' ';
    if (cl.length == 1) return Character.toString(cl[0]);

    for (int i = 1; i < cl.length; i++) {
      if (Character.isDigit(cl[i])) {
        int j = i;
        while (j >= 0 && cl[j - 1] == ' ') {
          j--;
        }
        cl[j] = ' ';
        cl[i - 1] = ' ';
      }
    }

    StringBuilder sb = new StringBuilder();
    for (char ch : cl) {
      if (ch != ' ') sb.append(ch);
    }
    return sb.toString().trim();
  }

  public static int findWinningPlayer(int[] skills, int k) { // {4, 2, 6, 3, 9 }, 2
    List<Integer> player = new ArrayList<>();
    for (int i = 0; i < skills.length; i++) {
      player.add(i); //{0,1,2,3,4}
    }

    int count = 0, lost;

    while (count < k) {
      System.out.println("value of count:" + count + " and value of k:" + k);
      int indexzero = player.get(0); //2
      System.out.println("First element in array list is:" + indexzero);
      if (skills[player.get(0)] > skills[player.get(1)]) { //6>3
        System.out.println(
          " First player won. Skill level of the first player:" +
          skills[player.get(0)] +
          " skill level of the second player:" +
          skills[player.get(1)]
        );
        lost = player.get(1); //1 3
        player.remove(1); //{0,2,3,4}

        player.add(lost); //{0,2,3,4,1} {2,4,1,0,3}
      } else {
        System.out.println(
          " Second player won. Skill level of the first player:" +
          skills[player.get(0)] +
          " skill level of the second player:" +
          skills[player.get(1)]
        );
        lost = player.get(0); //{0,2,3,4,1}
        player.remove(0); //{2,3,4,1}

        player.add(lost); //{2,3,4,1,0}
      }

      System.out.println("Our ArrayList: " + player.toString());
      int newindexzero = player.get(0); //2
      System.out.println(
        "Before element in position zero:" +
        indexzero +
        " and new index on position zero:" +
        newindexzero
      );
      if (indexzero == newindexzero) { //2!=0
        count++; //1
      } else {
        count = 1;
      }

      System.out.println("New Count value:" + count);
      System.out.println(
        "--------------------------------------------------------"
      );
      System.out.println("End of iteration");
      System.out.println(
        "========================================================="
      );
    }

    return player.get(0);
  }
}
// 4, 2, 6, 3, 9
// 0, 1, 2, 3, 4, 0, 1, 2, 3, 4

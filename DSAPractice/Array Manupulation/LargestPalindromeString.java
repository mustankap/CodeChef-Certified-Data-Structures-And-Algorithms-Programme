import java.io.*;
import java.util.*;

public class LargestPalindromeString {

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
    String n = next();
    System.out.println(largestPalindromic(n));
  }

  public static String largestPalindromic(String num) {
    if (num.length() == 1) return num;
    char S[] = num.toCharArray();
    List<Character> s = new ArrayList<>();
    for (char a : S) {
      s.add(a);
    }
    Collections.sort(s);
    int n = s.size();

    List<Character> start = new ArrayList<>();
    List<Character> end = new ArrayList<>();
    int i = n - 1;
    int flag = 0;
    int maxodd = Integer.MIN_VALUE;
    while (i >= 0) {
      if (i > 0 && s.get(i) == s.get(i - 1)) {
        start.add(s.get(i));
        end.add(s.get(i));
        i -= 2;
      } else {
        maxodd = Math.max(maxodd, s.get(i) - '0');

        flag = 1;
        i -= 1;
      }
    }
    Collections.reverse(end);
    StringBuilder ans = new StringBuilder();
    for (char a : start) {
      ans.append(a);
    }
    if (flag == 1) ans.append(maxodd);
    for (char a : end) {
      ans.append(a);
    }
    return removeleading0(ans.toString());
  }

  public static String removeleading0(String ans) {
    while (ans.startsWith("0")) {
      ans = ans.substring(1);
    }

    while (ans.endsWith("0")) {
      ans = ans.substring(0, ans.length() - 1);
    }
    if (ans == "") return "0";
    return ans;
  }

  public static String largePalindromic(String num) {
    int[] count = new int[10];
    for (char ch : num.toCharArray()) {
      count[ch - '0']++;
    }
    int non_zero = 0;
    int temp = 0;
    int odd = -1;

    for (int i = 9; i >= 0; i--) {
      if (i > 0) {
        non_zero = Math.max(non_zero, count[i]);
      }
      temp += ((count[i] / 2) * 2);
      odd = odd != -1 ? odd : count[i] % 2 != 0 ? i : -1;
    }

    if (odd != -1) {
      temp++;
    }
    if (non_zero == 1) {
      for (int i = 9; i >= 1; i--) {
        if (count[i] != 0) {
          return String.valueOf(i);
        }
      }
    }
    if (non_zero == 0) {
      return "0";
    }
    char[] c = new char[temp];
    int index = 0;
    if (odd != -1) {
      c[c.length / 2] = (char) ('0' + odd);
    }
    for (int i = 9; i >= 0; i--) {
      int t = count[i];
      t /= 2;
      while (t-- > 0) {
        char ch = (char) ('0' + i);
        c[index] = ch;
        c[c.length - 1 - index] = ch;
        index++;
      }
    }
    return new String(c);
  }
}

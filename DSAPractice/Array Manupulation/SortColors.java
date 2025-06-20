import java.io.*;
import java.util.*;

public class SortColors {

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
    //   br = new BufferedReader(new InputStreamReader(System.in));
    //   // int t = nextInt();
    //   // while (t-- > 0) {
    //   input();
    //   // }
    //   br.close();
    // }

    // public static void input() throws IOException {
    //   // int n = nextInt();
    int nums[] = { 2, 0, 2, 1, 1, 0 };
    // System.out.println(nums.toString());
    sortColors(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void sortColors(int[] nums) {
    Map<Integer, Integer> feq = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      feq.put(nums[i], feq.get(nums[i]) == null ? 1 : feq.get(nums[i]) + 1);
    }

    if (feq.containsKey(0)) {
      for (int i = 0; i < feq.get(0); i++) {
        nums[i] = 0;
      }
    }

    if (feq.containsKey(1)) {
      if (feq.containsKey(0)) {
        for (int i = feq.get(0); i < feq.get(0) + feq.get(1); i++) {
          nums[i] = 1;
        }
      } else {
        for (int i = 0; i < feq.get(1); i++) {
          nums[i] = 1;
        }
      }
    }

    if (feq.containsKey(2)) {
      int m = 0;
      if (feq.containsKey(1) && feq.containsKey(0)) m = feq.get(0) + feq.get(1);
      if (feq.containsKey(0) && !feq.containsKey(1)) m = feq.get(0);
      if (feq.containsKey(1) && !feq.containsKey(0)) m = feq.get(1);
      for (int i = m; i < nums.length; i++) {
        nums[i] = 2;
      }
    }
  }
}

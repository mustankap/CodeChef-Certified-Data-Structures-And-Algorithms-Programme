import java.io.*;
import java.util.*;

public class CheckIfArrayIsRotatedAndSorted {

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
    int nums[] = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = nextInt();
    }

    System.out.println(check(nums));
  }

  public static boolean check(int[] nums) {
    int i = 0;
    int flag = 0;
    for (i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        flag = 1;
        break;
      }
    }
    if (flag == 0) return true;
    System.out.println(
      "The Value of i when it came to know rotation may have taken place in this array:" +
      i
    );
    int na[] = new int[nums.length - (i + 1)];

    for (int g = 0; g < na.length; g++) na[g] = nums[i + g + 1];

    System.out.println("The Value na[0]:" + na[0]);

    System.out.println("NA entire array:" + Arrays.toString(na));
    int ans[] = new int[nums.length];
    for (i = 0; i < na.length; i++) {
      ans[i] = na[i];
    }
    System.out.println("Value of i:" + i);

    System.out.println("ans entire array:" + Arrays.toString(ans));
    int h = 0;
    for (int k = i; k < nums.length; k++) {
      ans[k] = nums[h];
      h++;
    }

    System.out.println("ans entire array:" + Arrays.toString(ans));

    for (int m = 0; m < ans.length - 1; m++) {
      if (ans[m] > ans[m + 1]) {
        return false;
      }
    }
    return true;
  }
}

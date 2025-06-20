import java.io.*;
import java.util.*;

public class twoSum {

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
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = nextInt();
    }
    int target = nextInt();
    System.out.println(Arrays.toString(twoSums(arr, target)));
  }

  public static int[] twoSums(int[] nums, int target) {
    Map<Integer, Integer> m = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      m.put(nums[i], i);
    }

    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int total = nums[left] + nums[right];
      if (total == target) {
        break;
      } else if (total > target) {
        right--;
      } else {
        left++;
      }
    }

    return new int[] { m.get(nums[left]), m.get(nums[right]) };
  }
}

import java.io.*;
import java.util.*;

public class HighestLowestFreq {

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
    // int k = nextInt();
    // System.out.println(Arrays.toString(getFrequencies(nums)));
    // System.out.println(maxFrequency(nums, k,0));
    // System.out.println(maxFrequency(nums, k));
  }

  public static int[] getFrequencies(int[] nums) {
    // Write Your Code Here
    Map<Integer, Integer> m = new TreeMap<>();
    for (int i = 0; i < nums.length; i++) {
      m.put(nums[i], m.get(nums[i]) == null ? 1 : m.get(nums[i]) + 1);
    }
    System.out.println("map key values:" + m);

    int max = Integer.MIN_VALUE, keymax = 0;
    int min = Integer.MAX_VALUE, keymin = 0;
    for (Integer mi : m.keySet()) {
      if (m.get(mi) > max) {
        max = m.get(mi);
        keymax = mi;
      }
      if (m.get(mi) < min) {
        min = m.get(mi);
        keymin = mi;
      }
      System.out.println("key value being checked:" + mi);
    }

    return new int[] { keymax, keymin };
  }

  public static int[] getFrequencies(int[] v, int n) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < v.length; i++) {
      // map.merge(v[i],1,Integer::sum);
      map.put(v[i], map.get(v[i]) == null ? 1 : map.get(v[i]) + 1);
    }

    int maxElement = 0, minElement = 0, minFreq = v.length, maxFreq = 0;

    for (Integer key : map.keySet()) {
      int count = map.get(key);

      if (count > maxFreq) {
        maxFreq = count;

        maxElement = key;
      } else if (count == maxFreq && key < maxElement) {
        maxElement = key;
      }

      if (count < minFreq) {
        minFreq = count;

        minElement = key;
      } else if (count == minFreq && key < minElement) {
        minElement = key;
      }
    }
    return new int[] { maxElement, minElement };
  }

  public static int maxFrequency(int[] nums, int k, int old) {
    Arrays.sort(nums);
    System.out.println("Array is:" + Arrays.toString(nums));
    int n = nums.length - 1, c = 0, max = Integer.MIN_VALUE;
    for (int i = n; i > 0; i--) {
      // c = 0;
      for (int j = i - 1; j >= 0; j--) {
        if ((nums[i] - nums[j]) <= k) {
          System.out.println("value of k in the start:" + k);
          k -= nums[i] - nums[j];
          System.out.println("value for nums[" + i + "] is:" + nums[i]);
          System.out.println("value for nums[" + j + "] is:" + nums[j]);
          System.out.println("value for k remaining is:" + k);
          System.out.println("value of c before incrementing:" + c);

          c++;
          System.out.println("value of c after incrementing:" + c);
          System.out.println(
            "****************************************************"
          );
        }
        System.out.println("value of max before incrementing:" + max);
        max = Math.max(max, c);

        System.out.println("value of max after incrementing:" + max);
      }
    }
    return max + 1;
  }

  public int maxFrequency(int[] nums, int k) {
    Arrays.sort(nums);
    int r = 0, l = 0, res = 0;
    long total = 0;
    int n = nums.length;
    // int M=1000000000;
    while (r < n) {
      total += nums[r];
      while (total + k < (long) nums[r] * (r - l + 1)) {
        total -= nums[l];
        l++;
      }
      res = Math.max(res, r - l + 1);
      r++;
    }

    return res;
  }

  public static int[] countFrequency(int n, int x, int[] nums) {
    // Write your code here.
    Map<Integer, Integer> m = new HashMap<>();

    for (int i = 0; i < n; i++) {
      m.put(nums[i], m.get(nums[i]) == null ? 1 : m.get(nums[i]) + 1);
    }

    int ans[] = new int[n];

    for (Integer mk : m.keySet()) {
      int MK = mk.intValue();
      if (MK <= n) ans[MK - 1] = m.get(MK);
    }

    return ans;
  }
}

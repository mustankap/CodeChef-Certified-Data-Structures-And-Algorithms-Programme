/**
 * import java.io.*;
 * import java.util.*;
 * 
 * class LongestSubarrayWithMaximumBitwiseAND {
 * static BufferedReader br;
 * static StringTokenizer st;
 * 
 * static int nextInt() throws IOException {
 * return Integer.parseInt(next());
 * }
 * 
 * static String next() throws IOException {
 * while (st == null || !st.hasMoreTokens()) {
 * st = new StringTokenizer(br.readLine());
 * }
 * return st.nextToken();
 * }
 * 
 * static long nextLong() throws IOException {
 * return Long.parseLong(next());
 * }
 * 
 * public static void main(String args[]) throws IOException {
 * br = new BufferedReader(new InputStreamReader(System.in));
 * int t = nextInt();
 * while (t-- > 0) {
 * input();
 * }
 * br.close();
 * }
 * 
 * public static void input() throws IOException {
 * }
 * }
 *
 */

// the bitwise AND of two different numbers will always be strictly less
// than the maximum of those two numbers
// so the longest subarray with max bitwise AND would be the subarray
// containing only the max numbers
// count length of the subarray where only maximum number is included

// example : [1,3,4,5,5,5,6,7,8,8,8,8]

// Ans : 4

import java.io.*;
import java.util.*;

class LongestSubarrayWithMaximumBitwiseAND {
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

        System.out.println(longestSubarray(nums));
    }

    static int longestSubarray(int[] nums) {
        int result = 0, length = 0, max = 0;
        for (int ele : nums) {
            max = Math.max(max, ele);
        }

        for (int ele : nums) {
            if (ele == max)
                length++;
            else
                length = 0;
            result = Math.max(result, length);
        }

        return result;
    }
}

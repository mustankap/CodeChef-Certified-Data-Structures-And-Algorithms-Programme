import java.io.*;
import java.util.*;

class MaxScoreAppK {
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
        int k = nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nextInt();
        }
        System.out.println(maxKelements(nums, k));
    }

    static long maxKelements(int[] nums, int k) {
        Arrays.sort(nums);
        long score = 0;
        int i = nums.length - 1;
        for (int c = 0; c <= k; c++) {
            score += nums[i];
            nums[i] = (int) Math.ceil(nums[i] / 3);
            Arrays.sort(nums);

        }
        return score;
    }
}
import java.io.*;
import java.util.*;

class AllSubsetsOfASet {
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
        int a[] = new int[n];

        List<List<Integer>> anslist = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
        a[i]=nextInt();

        findSubset(0, a, new ArrayList<>(), anslist);
        System.out.println(anslist);
    }

    public static void findSubset(int ind, int[] nums, List<Integer> ds, List<List<Integer>> anslist) {
        anslist.add(new ArrayList<Integer>(ds));
        for (int i = ind; i < nums.length; i++) {
            if (i != ind && nums[i] == nums[i - 1])
                continue;

            ds.add(nums[i]);
            findSubset(i + 1, nums, ds, anslist);
            ds.remove(ds.size() - 1);
        }
    }
}
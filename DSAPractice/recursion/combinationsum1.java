import java.io.*;
import java.util.*;

class combinationsum1 {
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
        int[] candidate = new int[n];
        for (int i = 0; i < n; i++) {
            candidate[i] = nextInt();

        }
        int k = nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        System.out.println(combination(0, n, k, candidate, ans, ds));
    }

    static List<List<Integer>> combination(int index, int n, int target, int[] candidates, List<List<Integer>> ans,
            List<Integer> ds) {
        if (candidates[index] == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return ans;
        }

        if (target >= candidates[index]) {
            ds.add(candidates[index]);
            combination(index, n, target - candidates[index], candidates, ans, ds);
            ds.remove(ds.size() - 1);
        }
        combination(index + 1, n, target, candidates, ans, ds);
        return ans;
    }
}
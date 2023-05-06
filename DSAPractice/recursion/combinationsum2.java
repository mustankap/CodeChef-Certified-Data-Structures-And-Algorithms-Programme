import java.io.*;
import java.util.*;

class combinationsum2 {
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
        combination(0, k, candidate, ans, ds);
        System.out.println(ans);

    }

    static void combination(int index, int target, int[] candidates, List<List<Integer>> ans,
            List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            } else if (target < candidates[index])
                return;

            ds.add(candidates[i]);
            combination(index + 1, target - candidates[i], candidates, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
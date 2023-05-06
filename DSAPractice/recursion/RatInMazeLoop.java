import java.io.*;
import java.util.*;

class RatInMazeLoop {
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
        // int t = 1;
        while (t-- > 0) {
            input();
        }
        br.close();
    }

    public static void input() throws IOException {
        int n = nextInt();
        // int n = 4;
        int m[][] = new int[n][n];
        int vis[][] = new int[n][n];
        // int[][] m = { { 1, 0, 0, 0 },
        // { 1, 1, 0, 1 },
        // { 1, 1, 0, 0 },
        // { 0, 1, 1, 1 } };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = nextInt();
            }
        }

        System.out.println(findPath(m, n, vis));

    }

    static void solve(int i, int j, int[][] m, int n, List<String> ans, String move, int[][] vis, int[] di,
            int[] dj) {
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }
        String dir = "DLRU";

        for (int ind = 0; ind < 4; ind++) {
            int nexti = i + di[ind];
            int nextj = j + dj[ind];

            if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj] == 0
                    && m[nexti][nextj] == 1) {
                vis[i][j] = 1;
                solve(nexti, nextj, m, n, ans, move + dir.charAt(ind), vis, di, dj);
                vis[i][j] = 0;
            }

        }
    }

    static List<String> findPath(int[][] m, int n, int[][] vis) {
        int di[] = { 1, 0, 0, -1 };
        int dj[] = { 0, -1, 1, 0 };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vis[i][j] = 0;
            }
        }
        List<String> ans = new ArrayList<>();
        if (m[0][0] == 1) {
            solve(0, 0, m, n, ans, "", vis, di, dj);
        }
        return ans;
    }

}
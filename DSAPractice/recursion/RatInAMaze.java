import java.io.*;
import java.util.*;

class RatInAMaze {
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
        int m[][] = new int[n][n];
        boolean vis[][] = new boolean[n][n];
        // {1, 0, 0, 0},
        // {1, 1, 0, 1},
        // {1, 1, 0, 0},
        // {0, 1, 1, 1}
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = nextInt();
            }
        }

        if (m[0][0] == 1) {
            vis[0][0] = true;
            System.out.println(findPath(m, n, vis));
        }
    }

    static ArrayList<String> findPath(int[][] m, int n, boolean[][] vis) {
        String pos = "";
        ArrayList<String> ans = new ArrayList<>();

        dfs(pos, 0, 0, m, ans, vis, n);

        return ans;

    }

    static void dfs(String pos, int row, int col, int[][] m, ArrayList<String> ans, boolean[][] vis,
            int n) {

        if (col == n - 1 && row == n - 1) {
            ans.add(pos.toString());
            return;
        }
        if (row < n - 1 && m[row + 1][col] == 1 && vis[row + 1][col] == false) {

            vis[row][col] = true;
            dfs(pos + "D", row + 1, col, m, ans, vis, n);
            vis[row][col] = false;

        }
        if (col > 0 && m[row][col - 1] == 1 && vis[row][col - 1] == false) {

            vis[row][col] = true;
            dfs(pos + "L", row, col - 1, m, ans, vis, n);
            vis[row][col] = false;

        }
        if (col < n - 1 && m[row][col + 1] == 1 && vis[row][col + 1] == false) {

            vis[row][col] = true;
            dfs(pos + "R", row, col + 1, m, ans, vis, n);
            vis[row][col] = false;

        }
        if (row > 0 && m[row - 1][col] == 1 && vis[row - 1][col] == false) {

            vis[row][col] = true;
            dfs(pos + "U", row - 1, col, m, ans, vis, n);
            vis[row][col] = false;

        }

    }
}
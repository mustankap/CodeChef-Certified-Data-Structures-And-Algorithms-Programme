import java.io.*;
import java.util.*;

class nQueensHashed {
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
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }

    public static List<List<String>> solveNQueens(int n) {
        char block[][] = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                block[i][j] = '.';
            }
        }
        int left[] = new int[n];
        int leftupperdiagonal[] = new int[2 * n - 1];
        int leftlowerdiagonal[] = new int[2 * n - 1];

        dfs(0, block, n, ans, left, leftlowerdiagonal, leftupperdiagonal);
        return ans;
    }

    public static List<String> change(char[][] block) {
        List<String> perm = new ArrayList<>();
        for (int i = 0; i < block.length; i++) {
            String s = new String(block[i]);
            perm.add(s);
        }
        return perm;
    }

    public static void dfs(int col, char[][] block, int n, List<List<String>> ans, int left[], int leftlowerdiagonal[],
            int leftupperdiagonal[]) {
        if (col == block.length) {
            ans.add(change(block));
            return;
        }
        for (int row = 0; row < block.length; row++) {
            if (left[row] == 0 && leftlowerdiagonal[row + col] == 0
                    && leftupperdiagonal[col - row + block.length - 1] == 0) {
                block[row][col] = 'Q';

                left[row] = 1;
                leftlowerdiagonal[row + col] = 1;
                leftupperdiagonal[col - row + n - 1] = 1;

                dfs(col + 1, block, n, ans, left, leftlowerdiagonal, leftupperdiagonal);
                block[row][col] = '.';

                left[row] = 0;
                leftlowerdiagonal[row + col] = 0;
                leftupperdiagonal[block.length - 1 + col - row] = 0;
            }
        }

    }

}
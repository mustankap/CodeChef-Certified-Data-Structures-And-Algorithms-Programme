import java.io.*;
import java.util.*;

class EqualRowandColumnPairs {
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
        int grid[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = nextInt();
            }
        }

        System.out.println(equalPairs(grid));
    }

    public static int equalPairs(int[][] grid) {

        if (grid == null || grid.length == 0)
            return 0;
        Map<String, Integer> rowStringCount = new HashMap<String, Integer>();
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            String key = "";
            for (int j = 0; j < n; j++) {
                key = key + "_" + grid[i][j];
            }
            int count = rowStringCount.getOrDefault(key, 0);
            rowStringCount.put(key, count + 1);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            String key = "";
            for (int j = 0; j < m; j++) {
                key = key + "_" + grid[j][i];
            }
            if (rowStringCount.containsKey(key)) {
                res += rowStringCount.get(key);
            }
        }
        return res;

    }
}

import java.io.*;
import java.util.*;

class nQueens {
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
        List<List<String>> ans = nqueen(n);

        for (List<String> i : ans) {
            System.out.println(i);
        }
    }

    public static List<List<String>> nqueen(int n) {
        List<List<String>> ans = new ArrayList<>();// all types of chessboard
        char block[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                block[i][j] = '.';
            }
        }
        recursive(0, block, ans);
        return ans;
    }

    public static void recursive(int col, char block[][], List<List<String>> ans) {
        if (col == block.length) {
            ans.add(construct(block));
            return;
        }
        for (int row = 0; row < block.length; row++) {
            if (validblock(block, row, col)) {
                block[row][col] = 'Q';
                recursive(col + 1, block, ans);
                block[row][col] = '.';
            }

        }
    }

    public static boolean validblock(char[][] block, int row, int col) {
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (block[row][col] == 'Q')
                return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (block[row][col] == 'Q')
                return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < block.length) {
            if (block[row][col] == 'Q')
                return false;
            col--;
            row++;
        }
        return true;
    }

    public static List<String> construct(char[][] block) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < block.length; i++) {
            String s = new String(block[i]);
            res.add(s);
        }
        return res;
    }
}

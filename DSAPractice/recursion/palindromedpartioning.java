import java.io.*;
import java.util.*;

class palindromedpartioning {
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
        String s = next();
        List<List<String>> ans = new ArrayList<>();
        List<String> blk = new ArrayList<>();
        part(0, s, blk, ans);
        System.out.println(ans);
    }

    static void part(int index, String s, List<String> blk, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(blk));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(index, i, s)) {
                blk.add(s.substring(index, i + 1));
                part(i + 1, s, blk, ans);
                blk.remove(blk.size() - 1);
            }
        }

    }

    static boolean isPalindrome(int start, int end, String s) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}
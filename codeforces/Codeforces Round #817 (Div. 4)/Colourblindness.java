import java.io.*;
import java.util.*;

public class Colourblindness {
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
        String s1 = next();
        String s2 = next();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if ((s1.charAt(i) == s2.charAt(i)) || (s1.charAt(i) == 'G' && s2.charAt(i) == 'B')
                    || (s1.charAt(i) == 'B' && s2.charAt(i) == 'G')) {
                c++;
            }
        }
        if (c == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}
import java.io.*;
import java.util.*;

class Fire {
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
        long mod = nextLong();

        long[] a = new long[n + 1];
        a[0] = 2;
        a[1] = 2;

        for (int i = 2; i <= n; i++) {
            a[i] = (a[i - 1] % mod + a[i - 2] % mod) % mod;
        }

        System.out.println(a[n - 1]);

    }
}

import java.io.*;
import java.util.*;

class pratikq {
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        solve(n, a);
    }

    static void solve(int n, int[] a) {
        int ans = 0;
        int sum = 0, asum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        for (int i = 0; i < n; i++) {
            asum += a[i];
        }

        if (asum > sum) {
            System.out.println(n);
            return;
        } else {
            Arrays.sort(a);
            int sumy = 0;
            List<Integer> l = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                sumy += i;
                l.add(sumy);
            }
            for (int i = 0; i < n; i++) {
                if (a[i] >= l.get(i)) {
                    ans++;
                }
            }

        }

        System.out.println(ans + 1);
    }
}

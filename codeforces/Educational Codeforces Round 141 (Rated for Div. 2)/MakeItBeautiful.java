import java.io.*;
import java.util.*;

public class MakeItBeautiful {
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

    static void input() throws IOException {
        int n = nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }

        solve(a, n);
    }

    static void solve(int[] a, int n) {
        int sum = 0;

        int p[] = a.clone();
        Arrays.sort(p);
        if (p[0] == p[n - 1]) {
            System.out.println("NO");
            return;
        }

        for (int i = 1; i < n; i++) {
            sum += a[i - 1];
            if (sum == a[i]) {
                sort(a);
                break;
            }
        }

        String str = "";
        for (int j = 0; j < n; j++) {

            str += a[j] + " ";

        }
        System.out.println("YES");
        System.out.println(str.trim());
    }

    static void sort(int[] a) {
        Integer[] A = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(A, 1, A.length, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            a[i] = A[i];
        }
    }

}
import java.io.*;
import java.util.*;
 
class CoinPiles {
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
        int a = nextInt();
        int b = nextInt();
 
        if ((a > 2 * b) || (b > 2 * a)) {
            System.out.println("NO");
        } else {
            if ((a + b) % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
    }
 
}

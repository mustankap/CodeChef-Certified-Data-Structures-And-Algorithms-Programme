import java.io.*;
import java.util.*;

public class PolycarpAndTheDayOfPi {
    static BufferedReader br;
    static StringTokenizer st;
    static final String pi = "314159265358979323846264338327";

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
        int c = 0;
        char pii[] = pi.toCharArray();
        String matcher = next();
        char[] mat = matcher.toCharArray();
        for (int i = 0; i < mat.length; i++) {
            if (mat[i] == pii[i]) {
                c++;
            } else {
                break;
            }

        }

        System.out.println(c);
    }
}
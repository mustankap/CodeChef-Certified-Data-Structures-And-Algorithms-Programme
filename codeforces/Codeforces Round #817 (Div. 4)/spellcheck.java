import java.io.*;
import java.util.*;

public class spellcheck {
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

        Set<Character> s = new HashSet<>();
        s.add('T');
        s.add('i');
        s.add('m');
        s.add('u');
        s.add('r');
        int n = nextInt();
        String word = next();
        if (n == 5) {
            Set<Character> in = new HashSet<>();

            for (int i = 0; i < word.length(); i++) {
                in.add(word.charAt(i));
            }

            if (s.equals(in)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
        } else {
            System.out.println("NO");
        }

    }
}
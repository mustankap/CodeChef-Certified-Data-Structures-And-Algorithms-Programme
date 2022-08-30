import java.io.*;
import java.util.*;

public class Wordgame {
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
        List<String> s1 = new ArrayList<>();
        List<String> s2 = new ArrayList<>();
        List<String> s3 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                String s = next();
                if (i == 0)
                    s1.add(s);
                if (i == 1)
                    s2.add(s);
                if (i == 2)
                    s3.add(s);
            }
        }

        Collections.sort(s1);
        Collections.sort(s2);
        Collections.sort(s3);

        int p1 = 0, p2 = 0, p3 = 0;
        for (int i = 0; i < n; i++) {
            if ((s2.contains(s1.get(i))) && !(s3.contains(s1.get(i)))) {
                p1++;
                p2++;
            } else if ((s3.contains(s2.get(i))) && !(s1.contains(s2.get(i)))) {
                p3++;
                p2++;
            } else if ((s1.contains(s3.get(i))) && !(s2.contains(s3.get(i)))) {
                p1++;
                p3++;
            } else if (!((s2).contains(s1.get(i))) && !((s3).contains(s1.get(i)))) {
                p1 += 3;
            } else if (!((s2).contains(s3.get(i))) && !((s1).contains(s3.get(i)))) {
                p3 += 3;
            } else if (!((s1).contains(s2.get(i))) && !((s3).contains(s2.get(i)))) {
                p2 += 3;
            } else {
                continue;
            }

        }

        System.out.println(p1 + " " + p2 + " " + p3);

    }
}

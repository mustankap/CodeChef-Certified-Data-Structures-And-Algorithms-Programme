import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

/**
 * There are 100 different types of caps each having a unique id from 1 to 100.
 * Also, there are ‘n’ persons each having a collection of a variable number of
 * caps. One day all of these persons decide to go in a party wearing a cap but
 * to look unique they decided that none of them will wear the same type of cap.
 * So, count the total number of arrangements or ways such that none of them is
 * wearing the same type of cap.
 * 
 * Constraints: 1 <= n <= 10 Example:
 * 
 * The first line contains the value of n, next n lines contain collections of
 * all the n persons. Input: 3 5 100 1 // Collection of the first person. 2 //
 * Collection of the second person. 5 100 // Collection of the third person.
 * 
 * // Output: // 4 // Explanation: All valid possible ways are (5, 2, 100),
 * (100, 2, 5), // (1, 2, 5) and (1, 2, 100) // Since, number of ways could be
 * large, so output modulo 1000000007
 * 
 */

public class count_cap_m1 {
    public static void main(String[] args) throws IOException {
        int t = ri();
        while (t-- > 0) {
            int a = rni(), b = ni();
            char[] ss = rcha();
            int n = ss.length, s[] = new int[n];
            for (int i = 0; i < n; ++i) {
                s[i] = ss[i] - '0';
            }
        }
        close();
    }

    static BufferedReader __in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer input;
    static Random __rand = new Random();
    // references
    // IBIG = 1e9 + 7
    // IMAX ~= 2e9
    // LMAX ~= 9e18
    // constants
    static final int IBIG = 1000000007;
    static final int IMAX = 2147483647;
    static final int IMIN = -2147483648;
    static final long LMAX = 9223372036854775807L;
    static final long LMIN = -9223372036854775808L;

    // math util
    static int minof(int a, int b, int c) {
        return min(a, min(b, c));
    }

    static int minof(int... x) {
        if (x.length == 1)
            return x[0];
        if (x.length == 2)
            return min(x[0], x[1]);
        if (x.length == 3)
            return min(x[0], min(x[1], x[2]));
        int min = x[0];
        for (int i = 1; i < x.length; ++i)
            if (x[i] < min)
                min = x[i];
        return min;
    }

    static long minof(long a, long b, long c) {
        return min(a, min(b, c));
    }

    static long minof(long... x) {
        if (x.length == 1)
            return x[0];
        if (x.length == 2)
            return min(x[0], x[1]);
        if (x.length == 3)
            return min(x[0], min(x[1], x[2]));
        long min = x[0];
        for (int i = 1; i < x.length; ++i)
            if (x[i] < min)
                min = x[i];
        return min;
    }

    static int maxof(int a, int b, int c) {
        return max(a, max(b, c));
    }

    static int maxof(int... x) {
        if (x.length == 1)
            return x[0];
        if (x.length == 2)
            return max(x[0], x[1]);
        if (x.length == 3)
            return max(x[0], max(x[1], x[2]));
        int max = x[0];
        for (int i = 1; i < x.length; ++i)
            if (x[i] > max)
                max = x[i];
        return max;
    }

    static long maxof(long a, long b, long c) {
        return max(a, max(b, c));
    }

    static long maxof(long... x) {
        if (x.length == 1)
            return x[0];
        if (x.length == 2)
            return max(x[0], x[1]);
        if (x.length == 3)
            return max(x[0], max(x[1], x[2]));
        long max = x[0];
        for (int i = 1; i < x.length; ++i)
            if (x[i] > max)
                max = x[i];
        return max;
    }

    static int powi(int a, int b) {
        if (a == 0)
            return 0;
        int ans = 1;
        while (b > 0) {
            if ((b & 1) > 0)
                ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static long powl(long a, int b) {
        if (a == 0)
            return 0;
        long ans = 1;
        while (b > 0) {
            if ((b & 1) > 0)
                ans *= a;
            a *= a;
            b >>= 1;
        }
        return ans;
    }

    static int fli(double d) {
        return (int) d;
    }

    static int cei(double d) {
        return (int) ceil(d);
    }

    static long fll(double d) {
        return (long) d;
    }

    static long cel(double d) {
        return (long) ceil(d);
    }

    static int gcf(int a, int b) {
        return b == 0 ? a : gcf(b, a % b);
    }

    static long gcf(long a, long b) {
        return b == 0 ? a : gcf(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / gcf(a, b);
    }

    static long lcm(long a, long b) {
        return a * b / gcf(a, b);
    }

    static int randInt(int min, int max) {
        return __rand.nextInt(max - min + 1) + min;
    }

    static long mix(long x) {
        x += 0x9e3779b97f4a7c15L;
        x = (x ^ (x >> 30)) * 0xbf58476d1ce4e5b9L;
        x = (x ^ (x >> 27)) * 0x94d049bb133111ebL;
        return x ^ (x >> 31);
    }

    // array util
    static void reverse(int[] a) {
        for (int i = 0, n = a.length, half = n / 2; i < half; ++i) {
            int swap = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = swap;
        }
    }

    static void reverse(long[] a) {
        for (int i = 0, n = a.length, half = n / 2; i < half; ++i) {
            long swap = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = swap;
        }
    }

    static void reverse(double[] a) {
        for (int i = 0, n = a.length, half = n / 2; i < half; ++i) {
            double swap = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = swap;
        }
    }

    static void reverse(char[] a) {
        for (int i = 0, n = a.length, half = n / 2; i < half; ++i) {
            char swap = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = swap;
        }
    }

    static void shuffle(int[] a) {
        int n = a.length - 1;
        for (int i = 0; i < n; ++i) {
            int ind = randInt(i, n);
            int swap = a[i];
            a[i] = a[ind];
            a[ind] = swap;
        }
    }

    static void shuffle(long[] a) {
        int n = a.length - 1;
        for (int i = 0; i < n; ++i) {
            int ind = randInt(i, n);
            long swap = a[i];
            a[i] = a[ind];
            a[ind] = swap;
        }
    }

    static void shuffle(double[] a) {
        int n = a.length - 1;
        for (int i = 0; i < n; ++i) {
            int ind = randInt(i, n);
            double swap = a[i];
            a[i] = a[ind];
            a[ind] = swap;
        }
    }

    static void rsort(int[] a) {
        shuffle(a);
        sort(a);
    }

    static void rsort(long[] a) {
        shuffle(a);
        sort(a);
    }

    static void rsort(double[] a) {
        shuffle(a);
        sort(a);
    }

    static int[] copy(int[] a) {
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; ++i)
            ans[i] = a[i];
        return ans;
    }

    static long[] copy(long[] a) {
        long[] ans = new long[a.length];
        for (int i = 0; i < a.length; ++i)
            ans[i] = a[i];
        return ans;
    }

    static double[] copy(double[] a) {
        double[] ans = new double[a.length];
        for (int i = 0; i < a.length; ++i)
            ans[i] = a[i];
        return ans;
    }

    static char[] copy(char[] a) {
        char[] ans = new char[a.length];
        for (int i = 0; i < a.length; ++i)
            ans[i] = a[i];
        return ans;
    }

    // input
    static void r() throws IOException {
        input = new StringTokenizer(rline());
    }

    static int ri() throws IOException {
        return Integer.parseInt(rline());
    }

    static long rl() throws IOException {
        return Long.parseLong(rline());
    }

    static double rd() throws IOException {
        return Double.parseDouble(rline());
    }

    static int[] ria(int n) throws IOException {
        int[] a = new int[n];
        r();
        for (int i = 0; i < n; ++i)
            a[i] = ni();
        return a;
    }

    static int[] riam1(int n) throws IOException {
        int[] a = new int[n];
        r();
        for (int i = 0; i < n; ++i)
            a[i] = ni() - 1;
        return a;
    }

    static long[] rla(int n) throws IOException {
        long[] a = new long[n];
        r();
        for (int i = 0; i < n; ++i)
            a[i] = nl();
        return a;
    }

    static double[] rda(int n) throws IOException {
        double[] a = new double[n];
        r();
        for (int i = 0; i < n; ++i)
            a[i] = nd();
        return a;
    }

    static char[] rcha() throws IOException {
        return rline().toCharArray();
    }

    static String rline() throws IOException {
        return __in.readLine();
    }

    static String n() {
        return input.nextToken();
    }

    static int rni() throws IOException {
        r();
        return ni();
    }

    static int ni() {
        return Integer.parseInt(n());
    }

    static long rnl() throws IOException {
        r();
        return nl();
    }

    static long nl() {
        return Long.parseLong(n());
    }

    static double rnd() throws IOException {
        r();
        return nd();
    }

    static double nd() {
        return Double.parseDouble(n());
    }

    // output
    static void pr(int i) {
        __out.print(i);
    }

    static void prln(int i) {
        __out.println(i);
    }

    static void pr(long l) {
        __out.print(l);
    }

    static void prln(long l) {
        __out.println(l);
    }

    static void pr(double d) {
        __out.print(d);
    }

    static void prln(double d) {
        __out.println(d);
    }

    static void pr(char c) {
        __out.print(c);
    }

    static void prln(char c) {
        __out.println(c);
    }

    static void pr(char[] s) {
        __out.print(new String(s));
    }

    static void prln(char[] s) {
        __out.println(new String(s));
    }

    static void pr(String s) {
        __out.print(s);
    }

    static void prln(String s) {
        __out.println(s);
    }

    static void pr(Object o) {
        __out.print(o);
    }

    static void prln(Object o) {
        __out.println(o);
    }

    static void prln() {
        __out.println();
    }

    static void pryes() {
        prln("yes");
    }

    static void pry() {
        prln("Yes");
    }

    static void prY() {
        prln("YES");
    }

    static void prno() {
        prln("no");
    }

    static void prn() {
        prln("No");
    }

    static void prN() {
        prln("NO");
    }

    static boolean pryesno(boolean b) {
        prln(b ? "yes" : "no");
        return b;
    };

    static boolean pryn(boolean b) {
        prln(b ? "Yes" : "No");
        return b;
    }

    static boolean prYN(boolean b) {
        prln(b ? "YES" : "NO");
        return b;
    }

    static void prln(int... a) {
        for (int i = 0, len = a.length - 1; i < len; pr(a[i]), pr(' '), ++i)
            ;
        if (a.length > 0)
            prln(a[a.length - 1]);
        else
            prln();
    }

    static void prln(long... a) {
        for (int i = 0, len = a.length - 1; i < len; pr(a[i]), pr(' '), ++i)
            ;
        if (a.length > 0)
            prln(a[a.length - 1]);
        else
            prln();
    }

    static void prln(double... a) {
        for (int i = 0, len = a.length - 1; i < len; pr(a[i]), pr(' '), ++i)
            ;
        if (a.length > 0)
            prln(a[a.length - 1]);
        else
            prln();
    }

    static <T> void prln(Collection<T> c) {
        int n = c.size() - 1;
        Iterator<T> iter = c.iterator();
        for (int i = 0; i < n; pr(iter.next()), pr(' '), ++i)
            ;
        if (n >= 0)
            prln(iter.next());
        else
            prln();
    }

    static void h() {
        prln("hlfd");
        flush();
    }

    static void flush() {
        __out.flush();
    }

    static void close() {
        __out.close();
    }

}
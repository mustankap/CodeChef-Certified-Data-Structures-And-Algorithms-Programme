// import java.io.*;
// import java.util.*;

// public class GreatestConvex {
// static BufferedReader br;
// static StringTokenizer st;

// static int nextInt() throws IOException {
// return Integer.parseInt(next());
// }

// static String next() throws IOException {
// while (st == null || !st.hasMoreTokens()) {
// st = new StringTokenizer(br.readLine());
// }
// return st.nextToken();
// }

// static long nextLong() throws IOException {
// return Long.parseLong(next());
// }

// public static void main(String args[]) throws IOException {
// br = new BufferedReader(new InputStreamReader(System.in));
// int t = nextInt();
// while (t-- > 0) {
// input();
// }
// br.close();
// }

// public static void input() throws IOException {
// long k = nextLong();
// int flag = 0;
// for (long gh = k - 1; gh > 0; gh--) {
// if (formula(gh, k) == true) {
// System.out.println(gh);
// flag = 1;
// break;
// }

// }
// if (flag == 0) {
// System.out.println(-1);
// }

// // x!+(x−1)! % k == 0
// }

// static boolean formula(long x, long k) {

// // ( a + b) % c = ( ( a % c ) + ( b % c ) ) % c

// if (((fact(x) % k) + (fact(x - 1) % k)) % k == 0)
// return true;
// else
// return false;
// }

// static long fact(long n) {
// if (n == 0)
// return 1;
// else
// return n * fact(n - 1);

// }
// }

// ==============================================================================================

/// real solution
/**
 * given 1<=x<k
 * and x is an integer so the maximum x can go till is k-1 since
 * we have to Find the largest integer x
 * 
 * now we have to prrove whether x! + (x-1)! is a multiple of k
 * x!=x(x-1)!
 * 
 * therefore x(x-1)! + (x-1)!
 * 
 * (x+1)(x-1)!
 * lets take the largest possible value of x which is k-1
 * =(k-1 + 1)(k-1-1)!
 * =k(k-2)! there for it is a multiple of k
 * 
 * thus the highest value of x such that x! + (x-1)! is a multiple of k is k-1
 */

import java.io.*;
import java.util.*;

class GreatestConvex {
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
        System.out.println(nextLong() - 1);

    }
}
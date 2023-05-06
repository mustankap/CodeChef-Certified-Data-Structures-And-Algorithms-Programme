import java.io.*;
import java.util.*;

public class QuickSort {
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
        /**
         * here we are finding the size of the largest increasing subsequence ie nos in
         * ascending order from the n elements in the array and storing it in c_v
         * 
         * then we know the remaining numbers will be needed to be sorted and added in
         * slots of k
         * therefore we do n - c_v and then divide by k.
         * 
         * (n-c_v)/k + 1 is the answer because 0 indexing
         * 
         */
        int n = nextInt();
        int k = nextInt();
        int p[] = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = nextInt();
        }

        int c_v = 1;
        for (int i = 0; i < n; i++) {
            if (p[i] == c_v)
                c_v++;
        }

        System.out.println((n - c_v + k) / k);
    }
}
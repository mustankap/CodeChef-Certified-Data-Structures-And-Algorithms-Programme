import java.io.*;
import java.util.*;

class CHEFST {
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
        long n1 = nextLong();
        long n2 = nextLong();
        long k = nextLong();
        long kx = (k*(k+1))/2;
        long min=(long)Math.min(n1,n2);
        if (kx<=min) 
        {
            System.out.println(n1 + n2- kx-kx);
        }else{   
            System.out.println(n1 + n2-min-min);
           
        }
        

    }
}
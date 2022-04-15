import java.io.*;
import java.util.*;

class CielandReceipt {
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
        int step=0;
        for(int i =11;i>=0;i--)
        {
            while(n>=Math.pow(2,i))
            {
                n=n-(int)Math.pow(2,i);
                step++;
            }
        }
        
       System.out.println(step);
    }

    

    
}
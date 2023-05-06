import java.io.*;
import java.util.*;

class Divisible {
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

public static void input()throws IOException
{
    System.out.println(noOfNumbers(11));

}

static long noOfNumbers(long N) {
    // code here
    // int c=0,flag=0;
    // int a[] = {2,3,5,7};
    
    // for(long i=1;i<=N;i++)
    // {
    //     for(int j=0;j<a.length;j++)
    //     {
    //         if(i%a[j]==0)
    //         {
    //             flag=1;
    //             break;
    //         }
           
    //     }
        
    //     if(flag==0)
    //         c++;
    //     else
    //         flag=0;
    
    
    return N-(N/2 + N/5 + N/7 + N/3 -(N/(2*3) + N/(2*5) + N/(2*7) + N/(5*7) + N/(5*3) + N/(7*3)) + N/(2*3*5*7));
    
}
}
import java.io.*;

import java.math.BigInteger;

import java.util.*;


public class vacc {
    static final int MOD = 1000000007;

    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    static void prln(long i) {__out.println(i);}
    static void close() {__out.close();}
    public static void main(String[] args)throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nm = br.readLine().split(" "); 
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] mstr = br.readLine().split(" ");
        int a[]=new int[m+1];
        
        
        for(int i=1;i<=m;i++)
        {
            a[i]=Integer.parseInt(mstr[i-1]);

        }

        Arrays.sort(a);
        long sum = 1;
        int d = n-m;

        long pows[] = new long[1001];
        long c[][]=new long[1001][1001];
        pows[0] = 1;
        pows[1] = 1;
    
        for(int i = 2; i <= 1000; i++){
        pows[i] = (pows[i - 1] * 2) % MOD;
        }

        c[0][0] = 1;
        for(int i = 1; i <=1000; i++)
        {
            c[i][0] = 1;
            for(int j = 1; j <= i; j++)
            {
                c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % MOD;
            }
        }

        for(int i = 1; i <= m; i++)
        {
            sum = (sum * c[d][a[i] - a[i - 1] - 1]) % MOD;
            d -= a[i] - a[i - 1] - 1;
        }
        
        for(int i = 2; i <= m; i++)
        {
            sum = (sum * pows[a[i] - a[i - 1] - 1]) % MOD;
        }

        prln(sum);

        
        close();
    }
}
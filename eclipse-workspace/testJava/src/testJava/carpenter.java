package testJava;
import java.util.*;
class carpenter
{
public static void main(String[] args) 
    {  int MOD = 100000007;
        Scanner s=new Scanner(System.in);
        
        long t = s.nextInt(); 
         
        while (t-- > 0) 
        { 
            int n=s.nextInt();
            int k=s.nextInt();
            long l[]=new long[k+1];
            long d[]=new long[k+1];
            for(int i = 1; i <= k; i++)
                l[i]=s.nextLong();
            for(int i = 1; i <= k; i++)
            	d[i]=s.nextLong();
            long dp[][]=new long[k+1][n+1];
            
            for(int u=0;u<dp.length;u++)
            {
                for(int e=0;e<dp[0].length;e++)
                {
                    dp[u][e]=0L;
                }
            }
            
            dp[0][0] = 1;
            for(int i = 1; i <= k; i++) {
                for(int j = 0; j <= n; j++) {
                    double rem = Math.min(d[i], j/(int)l[i]);
                    for(double f = 0; f <= rem; f++)
                        dp[i][j] =(long)( Math.floor((dp[i][j] + dp[i-1][j-(int)l[i]*(int)(Math.floor(f))]) % MOD));
                }
            }
            System.out.println(dp[k][n]);
            
            
            
            } 
        
    } 
} 

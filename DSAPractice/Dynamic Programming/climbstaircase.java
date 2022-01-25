import java.io.*;
import java.util.*;
public class climbstaircase {
// no of ways to reach a step when we can jump k steps at time at the maximum
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int n, k;

        n = Integer.parseInt(ar[0]);
        k = Integer.parseInt(ar[1]);
        System.out.println(solve(n, k));

    }
    /**
     *  int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i =2;i<=n;i++){
            
            for(int j =1;j<=k;j++)
            {
                if(i-j<0)
                    continue;
                dp[i]= dp[i]+dp[i-j];
                
            }
        }

        return dp[n];




        int dp[]=new int[k];
        dp[0]=1;
        
        for(int i =1;i<=n;i++){
            for(int j =1;j<k;j++)
            {
                if(i-j<0)
                {continue;}
                dp[i%k]= dp[i%k]+dp[(i-j)%k];
                
            }
        }

        return(dp[n%k]);
     */

    static int solve(int n, int k) {
        
        List<Integer> dp = new ArrayList<Integer>(Collections.nCopies(k, 0));
        
        dp.set(0,1);
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<k;j++)
            {if(i-j<0)
            continue;
            dp.set(i%k,dp.get(i%k)+dp.get((i-j)%k));}
        }
       
        return dp.get(n%k);
    }
}

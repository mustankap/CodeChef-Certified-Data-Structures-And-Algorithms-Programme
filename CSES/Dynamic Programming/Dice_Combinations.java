import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class Dice_Combinations {
    
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
       
        int dp[]= new int[n+1];
        dp[0]=1;
        dp[1]=1;
        int k=6;
            
        dp[0]=dp[1]=1;
        
        for(int i=2;i<=k;i++)
        dp[i] = 2*dp[i-1];
     
        for(int i=k+1;i<=n;i++)
        dp[i] = 2*dp[i-1]-dp[i-k-1];

        System.out.println(dp[n]);
    }
}


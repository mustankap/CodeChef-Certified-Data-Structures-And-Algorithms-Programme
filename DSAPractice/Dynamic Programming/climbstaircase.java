import java.io.*;
import java.util.*;
public class climbstaircase {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        int n, k;

        n = Integer.parseInt(ar[0]);
        k = Integer.parseInt(ar[1]);
        System.out.println(solve(n, k));

    }

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

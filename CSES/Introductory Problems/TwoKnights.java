

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Mustansir
 *
 */

public class TwoKnights {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<=n;i++)
        {
        	BigInteger m = BigInteger.valueOf(i);
        	System.out.println(calc(m));
        }
	}
	
	public static BigInteger calc(BigInteger i)
	{BigInteger ans=(i.multiply(i).multiply(i.multiply(i).subtract(BigInteger.valueOf(1))).subtract(BigInteger.valueOf(48)).subtract(BigInteger.valueOf(16).multiply(i.subtract(BigInteger.valueOf(4)))).subtract(BigInteger.valueOf(24).multiply(i.subtract(BigInteger.valueOf(4)))).subtract(BigInteger.valueOf(8).multiply(i.subtract(BigInteger.valueOf(4))).multiply(i.subtract(BigInteger.valueOf(4)))));
	
	ans=ans.divide(BigInteger.valueOf(2));
	return ans;
	}

}

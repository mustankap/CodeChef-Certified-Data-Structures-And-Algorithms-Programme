/**
 * 
 */
package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Mustansir
 *
 */
public class BitStrings {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
		BigInteger ans=BigInteger.valueOf(2).pow(n);
		System.out.println(ans.mod(BigInteger.valueOf(10).pow(9).add(BigInteger.valueOf(7))));
	}

}

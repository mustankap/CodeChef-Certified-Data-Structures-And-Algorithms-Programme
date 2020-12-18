/**
 * 
 */
package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Mustansir
 *
 */
public class TrailingZeros {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int i=5;
        int ans = 0;
        while(n/i>0)
        {
        	ans+=n/i;
            i*=5;
        }
        System.out.println(ans);

	}

}

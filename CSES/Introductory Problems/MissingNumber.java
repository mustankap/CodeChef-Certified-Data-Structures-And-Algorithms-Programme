package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st=br.readLine().split(" ");
        BigInteger m = new BigInteger("0");
        for(int i =0;i<st.length;i++)
        {
        	m=m.add(BigInteger.valueOf(Integer.parseInt(st[i])));
        }
        
        BigInteger sum = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n+1)).divide(BigInteger.valueOf(2));
        BigInteger ans =sum.subtract(m);
       System.out.println(ans);
	}

}

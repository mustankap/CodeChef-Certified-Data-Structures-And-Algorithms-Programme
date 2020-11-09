package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class IncreasingArray {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] ar = br.readLine().split(" ");
        BigInteger[] st= new BigInteger[ar.length];
        for(int i=0;i<ar.length;i++)
        {
        	st[i]=BigInteger.valueOf(Integer.parseInt(ar[i]));
        	
        	
        }
        
        BigInteger a=BigInteger.valueOf(0);int curr,prev;
        for(int i=1;i<n;i++)
        {
        	
            if(st[i].compareTo(st[i-1])<0)
                {a=a.add(st[i-1].subtract(st[i]));
                st[i]=st[i-1];
                }
        }
        System.out.println(a);
        	
        
	}

}

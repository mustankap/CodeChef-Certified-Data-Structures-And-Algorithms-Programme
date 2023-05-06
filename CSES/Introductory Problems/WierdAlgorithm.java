package CSES;

import java.util.Scanner;
import java.io.*;
public class WierdAlgorithm {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
		boolean stat=false;
		String ans= n + " ";
		while(n>1)
		{
			stat=(n%2==0)?false:true;
			n=stat?(n*3)+1:n/2;
			ans=ans+n+" ";
		}
		System.out.println(ans.trim());
		

	}

}

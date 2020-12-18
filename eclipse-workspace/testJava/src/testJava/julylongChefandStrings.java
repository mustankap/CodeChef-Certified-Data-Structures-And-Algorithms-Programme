package testJava;

import java.util.*;

public class julylongChefandStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
			
			int n = sc.nextInt();
			int i,a[]=new int[n],sum=0;
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			for(i=1;i<n;i++)
			{ 
				
				sum=sum+(Math.abs(a[i]-a[i-1]));
			}
			
			System.out.println(sum-n+1);
		}
	}

}

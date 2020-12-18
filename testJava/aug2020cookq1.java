package testJava;

import java.util.Scanner;

public class aug2020cookq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k = sc.nextInt();
			int w[]=new int[n];
			for(int i=0;i<n;i++)
			{
				w[i]=sc.nextInt();
			}
			int sum=0,co=0;
			
			for(int i=0;;i++)
			{
				for(int i=0;sum<k;i++)
				{	co++;
					sum+=w[i];
				}
			}
			
				
		}
	}

}

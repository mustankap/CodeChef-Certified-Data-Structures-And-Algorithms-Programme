package testJava;

import java.util.ArrayList;
import java.util.Scanner;

public class LINCHESS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			int min=Integer.MAX_VALUE;int ans=0;
			 for(int y:arr)
			 {	if(k%y==0)
			 	{
				if(k-y<min)
				{
					min=k-y;
					ans=y;
				}
				 
			 	}
				 
			 }
			 if(min==Integer.MAX_VALUE)
			 {
				 System.out.println(-1);
			 }
			 else
			 {
				 System.out.println(ans);
			 }
		}
	}

}

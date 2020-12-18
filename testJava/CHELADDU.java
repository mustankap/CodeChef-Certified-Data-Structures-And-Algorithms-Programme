package testJava;

import java.util.Arrays;
import java.util.Scanner;

public class CHELADDU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0)
		{
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s[]=new int[n];
		
		for(int i = 0;i<n;i++)
		{
			s[i]=sc.nextInt();
		}
		
		Arrays.parallelSort(s);
		int temp=0;
		int min=Integer.MAX_VALUE;
		
		for(int i = 0;i<n-1;i++)
		{
			temp=Math.abs((s[i+1]-s[i]));
			if(temp<min)
			{
				min=temp;
			}
		
		}
		
		System.out.println(min);
		}
		
	}

}

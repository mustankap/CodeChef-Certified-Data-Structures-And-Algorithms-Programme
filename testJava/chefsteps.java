package testJava;

import java.util.Scanner;

public class chefsteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]%k==0)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			
			System.out.println();
		}
	}

}

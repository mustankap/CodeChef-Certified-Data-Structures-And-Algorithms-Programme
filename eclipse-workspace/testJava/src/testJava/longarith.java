package testJava;

import java.util.Scanner;

public class longarith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		for(int u=1;u<=t;u++)
		{
			int n=sc.nextInt(),subs,prev=-1,max=0;
			int Max=Integer.MIN_VALUE;
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			for(int i=0;i<n-1;i++)
			{
				
				for(int j=i+1;j<n;j++)
				{
					subs=Math.abs(a[j]-a[j-1]);
					if(prev==subs)
						max++;
					else
						break;
					prev=subs;
				}
				Max=Math.max(max, Max);
			}
			System.out.println("Case #"+u+": "+Max);
			
		}

	}

}

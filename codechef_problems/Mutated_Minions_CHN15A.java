/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/problems/CHN15A/
/* Name of the class has to be "Main" only if the class is public. */
class Mutated_Minions_CHN15A
{
	public static void main (String[] args) 
	{ try {
	    
		    Scanner sc = new Scanner(System.in);
		//System.out.println("ENTER NO OF TESTCASES:");
		int t = sc.nextInt();
		while(t--!=0)
		{
		    
		//System.out.println("ENTER NO elements:");
		int n = sc.nextInt();
		//System.out.println("ENTER k value to add:");
		int k = sc.nextInt();
		//System.out.println("ENTER the elements:");
		int a[] = new int[n];
		int i,sum=0;
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
		    a[i]+=k;
		    if(a[i]%7==0)
		    sum++;
		}
		System.out.println(sum);
		
	}
	} catch(Exception e)
	{return;
	}
	}
}


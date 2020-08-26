/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/problems/DYNAMO/
/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Dynamo_DYNAMO
{
	public static void main (String[] args) throws java.lang.Exception
	{
	try{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int num=sc.nextInt();

long x=sc.nextLong();

long summ= (2*((long)Math.pow(10, num))+x);

System.out.println((long)summ);

System.out.flush();

long y=sc.nextLong();

long z= ((long)Math.pow(10, num)-y);

System.out.println((long)z);

System.out.flush();

long a=sc.nextLong();

long b= ((long)Math.pow(10, num)-a);

System.out.println((long)b);

System.out.flush();

int p=sc.nextInt();
 }
}catch(Exception e)
{return;
}
	}
}

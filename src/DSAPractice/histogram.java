package DSAPractice;

import java.util.Scanner;
import java.math.BigInteger;
public class histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		BigInteger a[]=new BigInteger[n];
		
		//Stack<Integer> st = new Stack<Integer>();
		do{
		
			for(int i =0;i<n;i++)
			{
				a[i]=BigInteger.valueOf(sc.nextInt());
			}
		//your code goes here
			BigInteger sum=	BigInteger.valueOf(0);
			for(int j=0;j<n;j++)
			{
				sum=sum.add(a[j]);
			}
		
			System.out.println(sum);
		n=sc.nextInt();
		
		}while(n!=0);
	}

}

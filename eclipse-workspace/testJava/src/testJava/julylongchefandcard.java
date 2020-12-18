package testJava;

import java.util.Scanner;

public class julylongchefandcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{   int noofrounds=sc.nextInt();
			int c=0,m=0;
			while(noofrounds-->0)
			{
			int chef=sc.nextInt();
			int morty=sc.nextInt();
			int j,sumc=0,h,summ=0;
			
			
			//divide number to digits
			while(chef>0)
			{j=chef%10;
			sumc+=j;
			chef=chef/10;}
			
			while(morty>0)
			{h=morty%10;
			summ+=h;
			morty=morty/10;}
			 
			if(sumc>summ)
			{ //System.out.print(0);
				c++;
			}else if(summ>sumc)
			{
				//System.out.print(1);
				m++;
			}
			else
			{
				//System.out.print(2);
				c++;m++;
			}

			
			}
			if(c>m)
			System.out.println("0"+" "+c);
			else if(m>c)
				System.out.println("1"+" "+m);
			else
				System.out.println("2"+" "+c);
			
			
		}

	}

}

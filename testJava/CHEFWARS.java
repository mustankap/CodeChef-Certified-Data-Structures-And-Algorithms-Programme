package testJava;

import java.util.Scanner;

public class CHEFWARS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int h=sc.nextInt();
			int p=sc.nextInt();
			while(p>0&&h>0)
			{
				h=h-p;
				p=p/2;
			}
			if((p==0||p<0)&&(h>0))
			{
				System.out.println(0);
			}
			else {
				System.out.println(1);
			}
			
		}

	}

}

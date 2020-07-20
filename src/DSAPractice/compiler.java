package DSAPractice;

import java.util.Scanner;

public class compiler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int d =0,b=0;
			String s=sc.next();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='<')
				{
					d++;
				}
				else {
					d--;
				}
				if(d==0)
				{
					b=i+1;
				}
				if(d<0)
				{
					break;
				}
			}
			System.out.println(b);
			
			
		}

	}

}

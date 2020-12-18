package testJava;

import java.util.Scanner;

public class CRDGAME3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
			int pr=sc.nextInt();
			int pc=sc.nextInt();
			int prd =0,pcd=0;
			if(pr%9==0)
			{
				prd=pr/9;
			}
			else
			{
				prd=pr/9 + 1;
			}
			
			if(pc%9==0)
			{
				pcd=pc/9;
			}
			else
			{
				pcd=pc/9 + 1;
			}
			
			if(prd==pcd)
			{
				System.out.println("1"+" "+prd);
			}
			else if(prd<pcd)
			{
				System.out.println("0"+" "+prd);
			}
			else 
			{
				System.out.println("1"+" "+pcd);
			}
			
		}
		
	}

}

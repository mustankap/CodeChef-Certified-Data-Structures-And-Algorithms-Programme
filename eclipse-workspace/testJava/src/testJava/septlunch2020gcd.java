package testJava;

import java.util.Scanner;

public class septlunch2020gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{	int no=0;
			int n = sc.nextInt(),temp=0;;
			int b[]=new int[n];
			int a[]=new int[n];
			
			for(int i =0;i<n;i++)
			{
				b[i]=sc.nextInt();
				a[i]=i+1;
				
			}
			
			for(int i=0;i<n;i++)
			{
	            if(b[i]>a[i] || a[i]%b[i]!=0)
	            {
	                temp=1;
	                break;
	                
	            }
	            else
	            {
	                temp=0;
	                
	            }
			}
	            
			
			if(temp==1)
	            {
	            	System.out.println("NO");
	            }
	            else
	            {
	            	System.out.println("YES");
	            }
			
			
			
		}
			

	}
}



package testJava;
import java.util.Scanner;

class septlunch2020{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{	int no=0;
			int n = sc.nextInt();
			int a[]=new int[n];
			for(int i =0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			
			int sum=0;
			for(int i = 0;i<n;i++)
			{	
				
				sum+=a[i];
			}
			
			if(sum<0 )
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

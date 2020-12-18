package testJava;
import java.util.*;
public class wallpass {
	
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0)
	{	int n=sc.nextInt();
		int a[]=new int[n],i;
		
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int q = sc.nextInt();
		int c=0;
		while(q-->0)
		{	int x=sc.nextInt();
			int y =sc.nextInt();
			int mid;
			
			int fl=0;
			int ll=a.length;
			 
			while(sl<ll)
			{
				mid=a.length/2;
				
				if(x+y>mid)
				{
					fl=mid+1;
				}
				if(x+y<mid)
				{
					ll=mid-1;
				}
			}
            System.out.println(c);
		}
			
	}
		
		
}



	
}


package testJava;
import java.util.*;
public class junelunch1 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
			int s = sc.nextInt();
			int sum=0,count=0,d,my;
			int n = sc.nextInt();
			
				
					sum=n;
					while(sum<=s)
					{
						sum=sum+n;
						count++;
					}
					sum=sum-n;d=sum;
					while(n>=2)
					{   my=sum+n;
						n=n-2;
						
						if((sum+n)==s)
						{count++;break;
							
						}else
						{
							continue;
						}
						
					}
					
					if(s%2==0)
					
					{System.out.println(count);}
					else
					{my=my+1;
					count++;
					System.out.println(count);}
					
			}
			
		}
	}

}

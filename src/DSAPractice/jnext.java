package DSAPractice;
import java.util.Arrays; 
import java.util.Scanner;

class jnext
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{	int n=sc.nextInt();
			int a[]=new int[n];
			for(int u=0;u<a.length;u++)
			{
				a[u]=sc.nextInt();
				
			}
			
			if (a.length <= 1) 
				System.out.println(-1);
				int last=a.length-2;
				
				int nextgreat=a.length-1;
				int i;
				
				while(last>=0)
				{
					if(a[last]<a[last+1])
					{
						break;
					}last--;
				}
				
				if (last < 0) 
					System.out.println(-1); 
				for(i=nextgreat;i>last;i--)
				{
					if(a[i]>a[last])
					{ nextgreat=i;break;
					}
				
				}
				a=swap(a,nextgreat,last);
				a=reverse(a,last+1,a.length-1);
				
				for(int m=0;m<a.length;m++)
				{
					System.out.print(a[m]);
				}
			
		}
	}
	
	
	
	
	public static int[] swap(int[] a,int nextgreat,int last)
	{
		
	
		a[last]^=a[nextgreat];
		a[nextgreat]^=a[last];
		a[last]^=a[nextgreat];
		return a;
	}
	public static int[] reverse(int[] a,int left,int right)
	{	// Reverse the sub-array 
		while (left < right) { 
			int temp = a[left]; 
			a[left++] =a[right]; 
			a[right--] = temp; 
		} 

		// Return the updated array 
		return a;
	
	
	}
	}
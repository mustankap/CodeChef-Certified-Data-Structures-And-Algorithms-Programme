package DSAPractice;

import java.util.*;

public class streetparade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		
		while((input=sc.nextInt())!=0)
		{	int n=input;
			int i=0;
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			
			 i=0;
			int k=0;
			Stack<Integer> st= new Stack<Integer>();
			while(i<n)
			{
				while(!st.empty() && st.peek()==k+1)
				{
					k++;
					st.pop();
				}
			
				if(a[i]!=k+1)
					st.push(a[i]);
				else
					k++;
			
				i++;
			}
			
			while(!st.empty() && st.peek()==k+1)
			{
				k++;
				st.pop();
			}
			
			if(k==n)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
				
			}
			
		}
		
		
	}

}
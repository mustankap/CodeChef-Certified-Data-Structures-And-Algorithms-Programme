package DSAPractice;

import java.util.Scanner;
import java.util.Stack;
public class MMASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mol=sc.next();
		int C=12,O=8,H=1;
		
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<mol.length();i++)
		{
			if(mol.charAt(i)=='(')
			{
				st.push(-1);
			}
			
			else if(mol.charAt(i)==')')
			{	int ans=0;
				while(!st.isEmpty() && st.peek()!=-1)
					{
						ans+=st.pop();
					}
				st.pop();
				st.push(ans);
			}
			else if(Character.isDigit(mol.charAt(i)))
			{
				int op=st.pop();
				st.push(op*((int)(mol.charAt(i)-48)));
				
			}
			else if(mol.charAt(i)=='C') 
			{
				st.push(12);
			}
				if(mol.charAt(i)=='H')
				{
					st.push(1);
				}
							if(mol.charAt(i)=='O')
							{
								st.push(16);
							}
								
							
						
						
		}
		
		int sum=0;
		while(!st.isEmpty())
		{  if(st.peek()==-1 )
			{
			st.pop();
			}else
			{sum+=st.pop();}
		}
		System.out.println(sum);

	}

}

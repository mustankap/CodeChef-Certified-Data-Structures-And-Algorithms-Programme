package DSAPractice;
import java.util.*;


public class onp {
	public static int priority(char c)
	{
		if(c=='+'||c=='-')
			return 1;
		if(c=='*'||c=='/')
			return 2;
		if(c=='^')
			return 3;
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String ans = new String("");
			String s = sc.next();
			Stack<Character> st = new Stack<Character>();
			for(int i =0;i<s.length();i++)
			{	if(Character.isLetterOrDigit(s.charAt(i)))
				{
				 ans+=s.charAt(i);
				}
				else if(s.charAt(i)=='(')
				{
					st.push(s.charAt(i));
				}
				else if(s.charAt(i)==')')
				{	while(!st.isEmpty() && st.peek()!='(')
						ans+=st.pop();
					
				if (!st.isEmpty() && st.peek() == '(') 
					st.pop();
				}
				else 
				{
					while(!st.isEmpty()&& priority(s.charAt(i))<=priority(st.peek()))
					{
						ans += st.pop();
					}
					st.push(s.charAt(i));
				}
			
			}
			while (!st.isEmpty() && st.peek() != ')')
			{ 
			ans += st.pop(); 
			} 
		System.out.println(ans);	
		}
	}

}

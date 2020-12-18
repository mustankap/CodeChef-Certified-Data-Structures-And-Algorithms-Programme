package DSAPractice;

import java.util.Scanner;
import java.util.Stack;

public class LongestRegularBracketSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input string of brackets
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		 
		//initializing Stack
		Stack<Character> st = new Stack<>();
		for(int i = 0; i <= s.length(); i++)
		{	
			if(st.isEmpty())
				
			if(s.charAt(i)=='(')
				st.push(s.charAt(i));
			if(s.charAt(i)==')'&&s.charAt(i-1)=='(')
				st.pop(); 
				
				
		}
		
		
	}

}

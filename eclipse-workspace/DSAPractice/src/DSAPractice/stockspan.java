package DSAPractice;
import java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;

public class stockspan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		while((input=sc.nextInt())!=0)
		{ 	int n=input;
			int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int s[]= new int[n];
			s[0]=1;
			
			Stack<Integer> st= new Stack<Integer>();
			st.push(0);
			for(int i=1;i<n;i++)
			{
				while(!st.isEmpty() && a[st.peek()]<=a[i])
				{
					st.pop();
				}
				
				s[i]=(st.isEmpty()?i+1:i-st.peek());
			st.push(i);
			}
			System.out.println(Arrays.toString(s));
		}
	}

}

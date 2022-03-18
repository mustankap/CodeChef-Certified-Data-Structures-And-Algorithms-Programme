
import java.util.*;

public class StackOfStack {
    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		Stack<Integer>[] s = new Stack[2];
		for(int i=0;i<2;i++)
		{
		    s[i]=new Stack<>();
		    int len =sc.nextInt();
		    int a[]=new int[len];
    		for(int k=0;k<len;k++)
    		{
    		    a[k]=sc.nextInt();
    		    
    		}
    		
    		for(int u=len-1;u>=0;u--)
    		{
    		    s[len-1-u].push(a[u]);
    		}
		}
		
		for(Stack<Integer> st : s)
		System.out.println(Arrays.toString(st.toArray()));
	}
}

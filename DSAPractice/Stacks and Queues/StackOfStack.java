
import java.util.*;

public class StackOfStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of stacks you want to add:");
		int nos = sc.nextInt();
		Stack<Integer>[] s = new Stack[nos];// this stack will have two stacks
		for (int i = 0; i < nos; i++) {
			s[i] = new Stack<>();
			System.out.println("Enter length of stack:");

			int len = sc.nextInt();
			int a[] = new int[len];
			System.out.println("Enter all elements of the stack:");

			for (int k = 0; k < len; k++) {
				a[k] = sc.nextInt();

			}

			for (int j = len - 1; j >= 0; j--)
				s[i].push(a[j]);

		}

		for (Stack<Integer> st : s) {
			System.out.print(Arrays.toString(st.toArray())+ " ");

			st.pop();

			System.out.print(Arrays.toString(st.toArray())+ " ");
		}
		System.out.println();
		System.out.println("------------------------------------");

		for (int k = 0; k < s.length; k++) {
			for(int g =0;g<s[k].size();g++)
			{
				System.out.println(s[k].peek());
				s[k].pop();
			}
			System.out.println("============");
		}
		
	}
}

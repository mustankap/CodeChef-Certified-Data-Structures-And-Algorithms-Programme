package testJava;
import java.util.*;
public class jlongcc1 {

	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the no of test cases:");
	int t = sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt(),loss=0;
		int k = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int p=sc.nextInt();
			if(p>k)
			{
				loss+=p-k;
			}
		}
		System.out.println(loss);
	}

	}

}

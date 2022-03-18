import java.util.*;
public class FitTriangle {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n = b/2;
		System.out.println((n*(n-1))/2);

		// f(b) = b/2 - 1 + f(b-2)
		sc.close();
	}
	

}
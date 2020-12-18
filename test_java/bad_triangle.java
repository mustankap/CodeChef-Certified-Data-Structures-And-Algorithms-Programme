package testJava;
/**
 *
 * 
 * 
 * 
 * 0 1  2  3  4  5  6 
 * 3 4 5 4 6 11 11 15 18 20
 * 
 * 
 * 6+11< 18
 * 
 * 
 * 
 */
import java.util.Scanner;

public class badtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[]= new int[n];
			int i;
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			if(a[0]+a[1]<=a[n-1]) 
				System.out.println(1+" "+2+" "+n);
			else 
				System.out.println(-1);
		}

	}

}

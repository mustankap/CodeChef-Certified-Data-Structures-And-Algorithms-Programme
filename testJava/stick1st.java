

import java.util.Arrays;
import java.util.Scanner;

public class stick1st {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if h is greater than array element the array element remains the Same
		//if h is less than array element the array element gets cut
		//if h is exact same size array element the array element remains the Same

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;
		int a[] = new int[n];

		for(int i = 0; i < n; i++)
		   a[i]=sc.nextInt();
		   
		    Arrays.sort(a);
		   
		    for(int i=n;i>)
		    if(a[i]!=a[i-1])
		    {
		        a[n]=a[n]-a[n-1];
		        count++;
		       
		    }





	}

}



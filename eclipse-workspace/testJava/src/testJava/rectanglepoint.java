package testJava;
import java.util.*;
 public class rectanglepoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{   
			int n =sc.nextInt(),i;
			//get coordinates
			
			long r[]=new long[4*n-1];
			long c[]=new long[4*n-1];
			
			for(i=0;i<4*n-1;i++)
			{
				r[i]=sc.nextLong();
				c[i]=sc.nextLong();
			}
			long ansc=getodd(c,4*n-1);
			long ansr=getodd(r,4*n-1);
			System.out.println(ansr+" "+ansc);
		}
		}
			
		public static long getodd(long arr[], int arr_size)
		{
			int i; 
        long res = 0; 
        for (i = 0; i < arr_size; i++)  
        { 
            res = res ^ arr[i]; 
        } 
        return res; 
			
		}
}



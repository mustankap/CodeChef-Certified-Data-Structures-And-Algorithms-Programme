package testJava;
import java.util.*;

public class recordbreaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(),rec=0;
		for(int k=1;k<=t;k++)
		{
			int n = sc.nextInt(),i,j;
			int a[]=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			int maxV=-1,ans=0;
			 for (i = 0; i < n; ++i)
			 {
	                int flag = 0;
	                if (a[i] > maxV)
	                    flag++;
	                if (i == n - 1 || a[i] > a[i + 1])
	                    flag++;
	                if (flag == 2)
	                    ans++;
	                maxV = Math.max(maxV, a[i]);
			 }
			
			System.out.println("Case #"+k+": "+ans);
		}

	}
}



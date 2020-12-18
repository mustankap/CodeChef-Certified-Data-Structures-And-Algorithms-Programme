package testJava;
import java.util.*;
public class flashmba {
	
	public static void main(String[] args)
	{
		
		//DO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int i,j,x;
			
			ArrayList<ArrayList<Integer> > a 
            = new ArrayList<ArrayList<Integer> >();
			
			for(i=0;i<n;i++)
			{	a.add(new ArrayList<Integer>());
				for(j=0;j<n;j++)
				{
					x=sc.nextInt();
					a.get(i).add(j,x); 
				}
			}
			
			if(solve(a,n)==true){
	            System.out.println("YES");
	        }
	        else{
	        	System.out.println("NO");
	        }
			
			
		}
		
		

	}
	
	
	public static boolean solve(ArrayList<ArrayList<Integer> > a ,int n)
	{
		int i,j,k;
		
		int dist[][]=new int[n][n];
		for (i = 0; i < n;i++)
	    {
	        for (j = 0; j < n;j++)
	        {
	            dist[i][j] = a.get(i).get(j);
	        }
	    }
	    for (k = 0; k < n;k++)
	    {
	        for (i = 0; i < n;i++)
	        {
	            for (j = 0; j < n;j++)
	            {
	                if (dist[i][k] + dist[k][j] < dist[i][j])
	                    dist[i][j] = dist[i][k] + dist[k][j];
	            }
	        }
	    }
	    for (i = 0; i < n;i++){
	        if (dist[i][i] < 0)
	            return true;
	    }
	    return false;
		
	}

}

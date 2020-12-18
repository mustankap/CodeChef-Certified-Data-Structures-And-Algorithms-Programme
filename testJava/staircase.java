package testJava;
import java.util.*;
public class staircase {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		int n,k,sol=0,temp=0;
		n = sc.nextInt();
	    k = sc.nextInt();
	    if(k<=n)
	    {
            sol=k;
        }
        else if(k>n)
        		{
            		temp=(k-n)%(n-1);
            		if((((k-n)/(n-1))%2)!=0)
            		{
            			sol=temp+1;
            		}
            else
            {
                sol=n-temp;
            }
        }
       System.out.println(sol);
    }
		
	}	

	
}

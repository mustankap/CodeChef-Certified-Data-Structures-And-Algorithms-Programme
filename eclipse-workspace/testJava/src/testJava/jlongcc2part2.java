package testJava;
import java.util.*;
public class jlongcc2part2 {

	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				int t= sc.nextInt();
				while(t-->0)
				{
		    	 int n= sc.nextInt(),g,flag=1,five=0,ten=0,fifteen=0;
		    	 for(int i=0;i<n;i++)
		    	 {
		    		g=sc.nextInt();
		    		
		    		
		    		
		    		
		    		int c=g-5;
		    		if(c==0)
		    		{
		    			five++;continue;
		    		}
		    		
		    		if(c==5)
		    		{   if(five!=0)
		    			{five--;
		    			ten++;}
		    		else
		    		{
		    			flag=0;break;
		    		}
		    		}
		    		
		    		if(c==10)
		    		{
		    			if(ten!=0)
		    			{
		    				ten--;
		    				fifteen++;
		    				
		    			}
		    			else if(five>=2)
		    			{ five-=2;
		    			  fifteen++;
		    			
		    			}
		    			else
		    			{
		    				flag=0;break;
		    			}
		    				
		    		}
		    	 
		    		
		    		  
		    	 }
		    	 
		    	 if(flag==1)
		    	 {
		    		 System.out.println("YES");
		    	 }
		    	 else
		    	 {
		    		 System.out.println("NO");
		    	 }
				}
	}
}

		    		
		    		
		    		
		    		
	

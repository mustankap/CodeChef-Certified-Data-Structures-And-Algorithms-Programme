/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class BreakingBricksCodechef
{
	public static void main (String[] args)
	{
	
	try {
	    Scanner sc = new Scanner(System.in);
	  
	    int T = sc.nextInt();
	    while(T!=0)
	    {    
	       int ans=0;
	        int s = sc.nextInt();
	        int w1 = sc.nextInt();
	        int w2 = sc.nextInt();
	        int w3 = sc.nextInt();
	        
	         
	         
	         if(w1<=s)
	         {   
	             if(w1+w2+w3<=s)
	             {  
	                 ans=1;
	             }else if(w1+w2<=s)
	             {
	                 ans=2;
	             }
	             else 
	             {
	                 ans=3;
	             }
	             
	         }
	        
	        
	        
	        
	        
	     System.out.println(ans);   
	        
	        T--;
		}
		
		
		sc.close();
	} catch(Exception e) {return;
	} 

	}
}

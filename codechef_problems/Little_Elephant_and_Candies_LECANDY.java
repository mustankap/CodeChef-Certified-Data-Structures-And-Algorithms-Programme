/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/problems/LECANDY
/* Name of the class has to be "Main" only if the class is public. */
class Little_Elephant_and_Candies_LECANDY
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc = new Scanner(System.in);
	  
	  int t = sc.nextInt();
	  while(t!=0)
		{ 
	          int n = sc.nextInt();
	          int at[] = new int[n];
		  
	          int c = sc.nextInt(); int i;
		  
		  int m=0;
		  for(i=0;i<n;i++)
			{at[i]=sc.nextInt();
			}
                
                 for(i=0;i<n;i++)
			{ if(c>=at[i])
				{
               c-=at[i];
				m++;}
			 else{m=0;break;}
			}
                    if(m==0)
                  {System.out.println("No");}
		  else
                 {System.out.println("Yes");
                 }
                   
		 t--;
		}
	
	




		    
		} catch(Exception e) {return;
		} 
		
	}
}


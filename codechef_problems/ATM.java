import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/problems/HS08TEST
/* Name of the class has to be "Main" only if the class is public. */
class ATM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); 
		float pb = sc.nextFloat(),rb=pb;
		//float rb = bankbal(w,pb);
	     if(pb>=(w+0.5))
		{
		    
		    if(w%5==0)
            rb=pb-(w+0.5f);
		}
		System.out.println(rb);
			
	}
	}

/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CNOTE
{
	public static void main (String[] args)throws IOException
	{
	try{ //when using parse int it is possible it fails due to kachra string giving 
        //numberFormatException therefore use this
		    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());
	
	    for(int yp =0;yp<t;yp++)
		{
		String st[]=br.readLine().split(" ");
		long x = Long.parseLong(st[0]);
		long y = Long.parseLong(st[1]);
		long k = Long.parseLong(st[2]);
		long n = Long.parseLong(st[3]);
		int i;
		boolean z=false;
        long[] pc = new long[2];
        
			for(i=0;i<n;i++)
			{
			    
				String st2[]=br.readLine().split(" ");
			    pc[0] = Long.parseLong(st2[0]);
			    pc[1] = Long.parseLong(st2[1]);
				if(pc[1]<=k && x-y<=pc[0])
				{z=true;}
			
			}
			 
			if(z==false)
			{System.out.println("UnluckyChef");}
			else
			{System.out.println("LuckyChef");}

		}
	}catch(Exception e){return;}
	}
}
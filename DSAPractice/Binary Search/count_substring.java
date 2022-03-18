import java.util.*;
import java.io.*;
public class count_substring
{
	public static void main(String[] args) {
	    try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int T = 1; T<=t;T++)
    	{	String[] nkq = br.readLine().split(" ");
    	    int n,k,q,l,r;
    	    
    	        n=Integer.parseInt(nkq[0]);
    	        k=Integer.parseInt(nkq[1]);
    	        q=Integer.parseInt(nkq[2]);
    	        String s = br.readLine();
    	        	for(int i = 0; i<q;i++)
    	            {
    	               String[] lr = br.readLine().split(" ");
    	               l = Integer.parseInt(lr[0]);
    	               r = Integer.parseInt(lr[1]);
    	               int one =0,zero=0,count =0;
    	               //code write here
    	               for(int j = l;j<r;j++)
    	               {
							for(int m = l;m<r;m++)
							{
								if(s.charAt(m)=='1')
								one++;
								if(s.charAt(m)=='0')
								zero++;
								
								if(one<=k && zero<=k)
								{
									count++;
								}
							}

    	               }
    	               
    	            one=0;zero=0;
    	            }
    	          
    	}
    	
	    }catch(Exception e)
	    {
	        return;
	    }
	}
}


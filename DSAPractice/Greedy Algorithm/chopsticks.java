package DSAPractise;
import java.io.*;
import java.util.*;



public class chopsticks {
	 static class FastReader 
	    { 
	        BufferedReader br; 
	        StringTokenizer st; 
	  
	        public FastReader() 
	        { 
	            br = new BufferedReader(new
	                     InputStreamReader(System.in)); 
	        } 
	  
	        String next() 
	        { 
	            while (st == null || !st.hasMoreElements()) 
	            { 
	                try
	                { 
	                    st = new StringTokenizer(br.readLine()); 
	                } 
	                catch (IOException  e) 
	                { 
	                    e.printStackTrace(); 
	                } 
	            } 
	            return st.nextToken(); 
	        } 
	  
	        int nextInt() 
	        { 
	            return Integer.parseInt(next()); 
	        } 
	  
	        long nextLong() 
	        { 
	            return Long.parseLong(next()); 
	        } 
	  
	        double nextDouble() 
	        { 
	            return Double.parseDouble(next()); 
	        } 
	  
	        String nextLine() 
	        { 
	            String str = ""; 
	            try
	            { 
	                str = br.readLine(); 
	            } 
	            catch (IOException e) 
	            { 
	                e.printStackTrace(); 
	            } 
	            return str; 
	        } 
	    } 
	
	 
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FastReader s=new FastReader();
		
	int n=s.nextInt();
	int d=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	
	Arrays.sort(a);
	int count=0;
	 for(int i=0;i<n-1;i++)
	 {
		if(a[i+1]-a[i]<=d)
		{
			i++;
			count++;
		}
	 }
		System.out.println(count);
			
		}
	}
						
			
		
	
	

 
	
	
	

	
	



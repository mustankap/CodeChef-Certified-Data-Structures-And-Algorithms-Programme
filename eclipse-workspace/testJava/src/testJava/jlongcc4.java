package testJava;
import java.util.*;
import java.io.*;


class jlongcc4
{ 
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
  
    public static void main(String[] args) 
    { 
        FastReader s=new FastReader(); 

		int t = s.nextInt();
		while(t-->0)
		{	int count=0;
			long TS= s.nextLong();
			 while (TS>1)
			{if(TS%2==0)
			{//even
				 TS=TS/2;
				            continue;
			}
			
			else{
				long m=2;
			            while(m<TS)
			                {count+=1;
			                m+=2;}
			            TS=1;
			}}
			
			System.out.println(count);
		}
		
	}

}

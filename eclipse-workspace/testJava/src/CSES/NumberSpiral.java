package CSES;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Mustansir
 *
 */
public class NumberSpiral 
{
	
	
	 static class Reader 
	   { 
	       final private int BUFFER_SIZE = 1 << 16; 
	       private DataInputStream din; 
	       private byte[] buffer; 
	       private int bufferPointer, bytesRead; 
	 
	       public Reader() 
	       { 
	           din = new DataInputStream(System.in); 
	           buffer = new byte[BUFFER_SIZE]; 
	           bufferPointer = bytesRead = 0; 
	       } 
	 
	       public Reader(String file_name) throws IOException 
	       { 
	           din = new DataInputStream(new FileInputStream(file_name)); 
	           buffer = new byte[BUFFER_SIZE]; 
	           bufferPointer = bytesRead = 0; 
	       } 
	 
	       public String readLine() throws IOException 
	       { 
	           byte[] buf = new byte[64]; // line length 
	           int cnt = 0, c; 
	           while ((c = read()) != -1) 
	           { 
	               if (c == '\n') 
	                   break; 
	               buf[cnt++] = (byte) c; 
	           } 
	           return new String(buf, 0, cnt); 
	       } 
	 
	       public int nextInt() throws IOException 
	       { 
	           int ret = 0; 
	           byte c = read(); 
	           while (c <= ' ') 
	               c = read(); 
	           boolean neg = (c == '-'); 
	           if (neg) 
	               c = read(); 
	           do
	           { 
	               ret = ret * 10 + c - '0'; 
	           }  while ((c = read()) >= '0' && c <= '9'); 
	 
	           if (neg) 
	               return -ret; 
	           return ret; 
	       } 
	 
	       public long nextLong() throws IOException 
	       { 
	           long ret = 0; 
	           byte c = read(); 
	           while (c <= ' ') 
	               c = read(); 
	           boolean neg = (c == '-'); 
	           if (neg) 
	               c = read(); 
	           do { 
	               ret = ret * 10 + c - '0'; 
	           } 
	           while ((c = read()) >= '0' && c <= '9'); 
	           if (neg) 
	               return -ret; 
	           return ret; 
	       } 
	 
	       public double nextDouble() throws IOException 
	       { 
	           double ret = 0, div = 1; 
	           byte c = read(); 
	           while (c <= ' ') 
	               c = read(); 
	           boolean neg = (c == '-'); 
	           if (neg) 
	               c = read(); 
	 
	           do { 
	               ret = ret * 10 + c - '0'; 
	           } 
	           while ((c = read()) >= '0' && c <= '9'); 
	 
	           if (c == '.') 
	           { 
	               while ((c = read()) >= '0' && c <= '9') 
	               { 
	                   ret += (c - '0') / (div *= 10); 
	               } 
	           } 
	 
	           if (neg) 
	               return -ret; 
	           return ret; 
	       } 
	 
	       private void fillBuffer() throws IOException 
	       { 
	           bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
	           if (bytesRead == -1) 
	               buffer[0] = -1; 
	       } 
	 
	       private byte read() throws IOException 
	       { 
	           if (bufferPointer == bytesRead) 
	               fillBuffer(); 
	           return buffer[bufferPointer++]; 
	       } 
	 
	       public void close() throws IOException 
	       { 
	           if (din == null) 
	               return; 
	           din.close(); 
	       } 
	   } 
	 
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Reader s = new Reader();
        int T=s.nextInt();
        while(T-->0)
        {
        	BigInteger x =BigInteger.valueOf(s.nextInt());
        	BigInteger y =BigInteger.valueOf(s.nextInt());
        	BigInteger t;
        	if(x.compareTo(y)==0 || x.compareTo(y)==1)
			{
        		t=x.multiply(x.subtract(BigInteger.valueOf(1))).add(BigInteger.valueOf(1));
        		if(x.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0))==0)
			    {
			    	System.out.println(t.add(x).subtract(y));
			    }
			    else
			    {
			    	System.out.println(t.subtract(x).add(y));
			    }
			}
			else
			{
				t=y.multiply(y.subtract(BigInteger.valueOf(1))).add(BigInteger.valueOf(1));
        		
				if(y.mod(BigInteger.valueOf(2)).compareTo(BigInteger.valueOf(0))==0)
					System.out.println(t.subtract(y).add(x));
		        else
		        	System.out.println(t.add(y).subtract(x));
			}
			        
        }
				
				   
	}

}


import java.io.IOException;
import java.math.BigInteger;
import java.io.DataInputStream;
import java.io.FileInputStream;

 
/**
* @author Mustansir
*
*/
public class codejamreverse {
 
/**
* @param args
*/
 
 
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
if (c == ' ')
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
public static void main(String[] args)throws IOException {
// TODO Auto-generated method stub
Reader s = new Reader();

int t=s.nextInt();
        for(int T=1;T<=t;T++)
        {   int n=s.nextInt();
            int j,cost=0;
            BigInteger[] ar=new BigInteger[n];
            
            for(int i=0;i<ar.length;i++)
            {
                ar[i]=BigInteger.valueOf(s.nextInt());
            }
            
            
            for(int i=0;i<ar.length-1;i++)
            {  
               for(j=i;j<n;j++)
               {
                   if(ar[j].equals(BigInteger.valueOf(i+1)))
                   {   
                       reverse(ar,i,j+1);
                    cost += j-i+1;

                   }
               }
               ;
            }

            System.out.println("Case #"+(T)+": "+cost);
        }
    }

    // public static int findmin(BigInteger[] ar,int i,int l)
    // {   BigInteger min = BigInteger.valueOf(Integer.MAX_VALUE);
    //     int index = 0;
    //     for(int m=i;m<l;m++)
    //     if(ar[m].compareTo(min)==-1)
    //     {
    //         min=ar[m];
    //         index=m;
    //     }
    //     return index;
    // }
    public static void reverse(BigInteger[] ar,int i, int j)
    {      int m;
        BigInteger t;
        for (m = i; m < j / 2; m++) {
            t = ar[m];
            ar[m] = ar[j - m - 1];
            ar[j - m - 1] = t;
        } 
    }
}

 

        
    


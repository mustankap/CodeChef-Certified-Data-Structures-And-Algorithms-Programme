
import java.io.*;
import java.util.*;

public class circular_dominos {
    static BufferedReader __in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer input;
    static final int IBIG = 1000000007;

    static String rline() throws IOException {return __in.readLine();}
    static int ri() throws IOException {return Integer.parseInt(rline());}
    static void r() throws IOException {input = new StringTokenizer(rline());}
    static String n() {return input.nextToken();}
    static int rni() throws IOException {r(); return ni();}
    static int ni() {return Integer.parseInt(n());}
    static char[] rcha() throws IOException {return rline().toCharArray();}
    static void prln(int i) {__out.println(i);}
    static void close() {__out.close();}
    public static void main(String[] args) throws IOException {
        int t = ri();
        while (t --> 0) {
            int a = rni(), b = ni();
            String s=rline();
            int n = s.length();
            int i = 0;
            
            List<Integer> v = new ArrayList<>();

            for(i=0; i<n; i++)
            {
                if(s.charAt(i) == '0')
                {
                    if(i == 0  ||  s.charAt(i-1) == '1')
                    {
                        v.add(0);
                    }
                    v.set(v.size()-1,v.get(v.size()-1)+1);
                
                }
            }

            

            if(v.size() == 1  &&  v.get(0) == n)
            {
                prln(0);
                continue;
            }

            int ans = a;
            if(v.isEmpty()==false)
            {
                if(s.charAt(0) == '0'  &&  s.charAt(n-1) == '0')
                {
                    n = v.get(v.size()-1);
                    v.remove(v.size() - 1);
                    
                    if(v.isEmpty())
                    {
                        v.add(n);
                    }
                    else 
                    {
                        v.set(0,v.get(0)+n);
                    }
                }

                Collections.sort(v);
                
                v.remove(v.size() - 1);

                n=v.size();
                
                for(i=0; i<n; i++)
                {
                    ans+=Math.min(b*v.get(i),a);
                }
            }
            prln(ans);
        }
        close();
    }

}


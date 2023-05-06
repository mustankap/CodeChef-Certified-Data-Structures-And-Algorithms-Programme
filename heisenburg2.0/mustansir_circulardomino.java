
import java.io.*;
import java.util.*;
 
import static java.lang.Math.*;
// import static java.util.Arrays.*;
// 5 4
// 1111000101011
public class mustansir_circulardomino {
 
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
            char[] ss = rcha();
            int n = ss.length, m[] = new int[n];
            for (int i = 0; i < n; ++i) {
                m[i] = ss[i] - '0';
            }
            int dp[] = new int[n + 1], empty_seg = 0;
            boolean first = true;

            int s[]=split(m);

            for (int i = 0; i < n; ++i) {
                if (s[i] == 0) {
                    ++empty_seg;
                    dp[i + 1] = dp[i];
                } else if (i > 0 && s[i - 1] == 1) {
                    empty_seg = 0;
                    dp[i + 1] = dp[i];
                } else {
                    dp[i + 1] = min(dp[i] + a, first ? IBIG : dp[i] + b * empty_seg);
                    first = false;
                    empty_seg = 0;
                }
            }
            prln(dp[n]);
        }
        close();
    }

    public static int[] split(int[] s)
{   int n = s.length;
    List<Integer> m = new ArrayList<>();
    List<Integer> only = new ArrayList<>();
    
    for (int i: s) {
        m.add(Integer.valueOf(i));
    }
        
   
        
    for (int i = 0; i < m.size(); i++) {
            if(m.get(i)==0){
               break; 
            }
            else{
               only.add(m.get(i));
            }
        }
        int a1[]=new int[n];
        if(m.size()==only.size())
        {
            a1= convertIntegers(only);
        }
        else if(only.size()==0)
        {
            a1= convertIntegers(m);

        }
        else{
    for (int i = 0; i <n; i++) {
            if(m.get(i)==0){
               break; 
            }
            else{
               m.remove(i);
               i--;
           }
        }
        
        
        
    ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(m);
        merge.addAll(only);
        
       a1= convertIntegers(merge);

        
    }

    return a1;
}


    public static int[] convertIntegers(List<Integer> integers)
    {
    int[] ret = new int[integers.size()];
    for (int i=0; i < ret.length; i++)
    {
        ret[i] = integers.get(i).intValue();
    }
    return ret;
    }
}
 
    
    
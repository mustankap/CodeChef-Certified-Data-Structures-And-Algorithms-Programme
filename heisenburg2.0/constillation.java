import java.io.*;
import java.util.*;
 

public class constillation {
 
    static BufferedReader __in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer input;
    static final int nPrime = 998244353;

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
        int n = ri();
        int nOrd = 1;
        int viAns[]=new int[n+1];

        for(int i = 1; i <= n; i++){
            nOrd *= 2;
            nOrd %= nPrime;
            viAns[i] = nOrd - (1+i+i*(i-1)/2);
            viAns[i] %= nPrime;
        }

        long viixy[][]=new long[n][2];
        for(int i = 0; i < n; i++)
        {
            viixy[i][0] = rni();
            viixy[i][1]  = ni();
        }

        int vviNum[][]=new int[n][n];

        long viCount[]=new long[n+1];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                for(int k = 0; k < n; k++){
                    if(  (viixy[i][0] - viixy[j][0]) * (viixy[j][1] - viixy[k][1]) == (viixy[j][0] - viixy[k][0]) * (viixy[i][1] - viixy[j][1]))
                    {
                        vviNum[i][j]++;
                    }
                }
                viCount[vviNum[i][j]]++;
                
            }
        }


        int nAns = viAns[n];
        for(int i = 3; i <= n; i++)
        {
            viCount[i] /= (i*(i-1));
            nAns -= viAns[i] * viCount[i];
            nAns %= nPrime;
        }  
        nAns += nPrime;
        nAns %= nPrime;

        prln(nAns);
        close();
    }
}
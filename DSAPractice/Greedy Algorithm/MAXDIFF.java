import java.io.*;
import java.util.*;

class MAXDIFF {
    static BufferedReader br;
    static StringTokenizer st;

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = nextInt();
        while (t-- > 0) {
            input();
        }
        br.close();
    }

public static void input()throws IOException
{ 
    int n = nextInt();
    int k = nextInt();

    int a[]=new int[n];

    for(int i =0;i<n;i++)
    {
        a[i]= nextInt();
    }

    Arrays.sort(a);
    int suml=0;
  
    for(int j =0;j<k;j++)
    {
        suml+=a[j];
    }
    int summ=0;
    for(int ki = k;ki<n;ki++)
    {
        summ+=a[ki];

    }
    int maxdiff=0;
    if(k<n-k)
        maxdiff = (summ-suml);
    else
       maxdiff = (suml-summ);

    List<Integer> A = new ArrayList<>();
    for(int i =0;i<n;i++)
    {
        A.add(a[i]);
    }

    Collections.sort(A, Collections.reverseOrder());

    int sumlA=0;
  
    for(int j =0;j<k;j++)
    {
        sumlA+=A.get(j);
    }
    int summA=0;
    for(int ki = k;ki<n;ki++)
    {
        summA+=A.get(ki);

    }
    int maxdiffA=0;
    if(k<n-k)
        maxdiffA = (summA-sumlA);
    else
       maxdiffA = (sumlA-summA);



    if(maxdiff>=maxdiffA)
    {    System.out.println(maxdiff);}
    else{
        System.out.println(maxdiffA);
    }


}
}

import java.io.*;
import java.util.*;

public class TaisiaAndDice {
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

    public static void input() throws IOException {
        int n = nextInt();
        int s = nextInt();
        int r = nextInt();
        int rr = r;
        int m = n - 1;
        for (int i = 1; i <= m; i++) {
            n--;
            if (i != 1)
                System.out.print(" ");
            int x = r / n;
            r -= x;
            System.out.print(x);
        }
        System.out.println(" " + (s - rr));
    }
}

/**
 * 
 * #include<bits/stdc++.h>
 * using namespace std;
 * int main(){
 * int t;
 * cin>>t;
 * while(t--){
 * int n,sum,r;
 * cin>>n>>sum>>r;
 * int m=n-1;
 * int rr=r;
 * for(int i=1;i<=m;i++){
 * n--;
 * if(i!=1) cout<<" ";
 * int x=r/n;
 * r-=x;
 * cout<<x;
 * }
 * cout<<' '<<sum-rr<<endl;
 * }
 * }
 * 
 */
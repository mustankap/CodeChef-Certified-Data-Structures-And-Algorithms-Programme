
/**
 * a[]=,k=4
 *  {2 1 7 3 5 2 6}
 *  {2,1,3,3,1,2,2}
 *  {2:3,1:2,3:2}
 *  2 2 -> 2
 *  3 1 -> 2
 * 
 * hm.contains(k/2)
 * get()
 *  (a+b)%k==0
 *  (a%k+b%k)
 * 
 *  aaabbbcc
 *  
 

import java.io.*;
import java.util.*;



public class infosys {

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
        int a[] =new int[n];
        int k = nextInt();
        for(int i =0;i<a.length;i++)
        {
            a[i]=a[i]%k;
        }

        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : a)
        {
            if(hm.isEmpty())
            {
            hm.get()
            }
        }
        

    }
}
// import React from react,{Components};

// class a extends Components{
//     render();
// }


 * 
 * where sal == 5 having 
 */
import java.io.*;
import java.util.*;

class MaximumMatchingofPlayersWithTrainers {
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

    }

    static int matchPlayersAndTrainers(int[] players, int[] trainers) {

        int no_of_pairs=recur(0,players,trainers);
        return 1;
    }
    static int recur(int ind, int[] players, int[] trainers)
    {
        if(players[ind]>trainers[ind])
        {
            return -1;
        }
        else{
            
        }
    }
}
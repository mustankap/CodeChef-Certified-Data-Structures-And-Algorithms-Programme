
/**
1
9 10
1 2
2 3
3 4
4 5
3 6
6 5
7 2
7 8
8 9
9 5

1 --> 2 --> 3 --> 4 --> 5 <--
      ^     |           ^   |
      |     ^           |   |
      7     6 -----------   |
      |                     |
      ^                     |  
      8 --> 9 ---------------
 
 */
import java.io.*;
import java.util.*;

class DetectCycleInDirectedGraphDFS {
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
        int vertices = nextInt();
        int edges = nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < vertices + 1; i++) {
            adj.add(new ArrayList<>());

        }

        for (int i = 0; i < edges; i++) {
            int source = nextInt();
            int destination = nextInt();
            adj.get(source).add(destination);
        }
        int vis[] = new int[vertices + 1];
        int dfsvis[] = new int[vertices + 1];
        System.out.println(adj);
        System.out.println(dfs(adj, vis, dfsvis));
    }

    static boolean dfs(List<List<Integer>> adj, int[] vis, int[] dfsvis) {
        for (int i = 0; i < vis.length; i++) {
            if (vis[i] == 0) {
                if (dfs(i, adj, vis, dfsvis) == true)
                    return true;
            }
        }
        return false;
    }

    static boolean dfs(int ind, List<List<Integer>> adj, int[] vis, int[] dfsvis) {
        vis[ind] = 1;
        dfsvis[ind] = 1;
        for (int it : adj.get(ind)) {
            if (vis[it] == 0) {
                if (dfs(it, adj, vis, dfsvis) == true) {
                    return true;
                }
            } else if (dfsvis[it] == 1) {
                return true;
            }

        }

        dfsvis[ind] = 0;
        return false;
    }

}
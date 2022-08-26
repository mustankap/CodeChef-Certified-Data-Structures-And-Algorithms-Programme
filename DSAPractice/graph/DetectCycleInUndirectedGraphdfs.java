import java.io.*;
import java.util.*;

class DetectCycleInUndirectedGraphdfs {
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
            adj.get(destination).add(source);

        }
        int vis[] = new int[vertices + 1];
        System.out.println(adj);
        boolean result = false;
        for (int i = 1; i < vis.length; i++) {
            if (vis[i] == 0) {
                result = dfs(i, adj, vis, -1);
            }
        }
        System.out.println(result);
    }

    static boolean dfs(int ind, List<List<Integer>> adj, int[] vis, int parent) {
        vis[ind] = 1;
        for (int it : adj.get(ind)) {
            if (vis[it] == 0) {
                dfs(it, adj, vis, ind);
            } else if (it != parent) {
                return true;
            }

        }
        return false;
    }
}
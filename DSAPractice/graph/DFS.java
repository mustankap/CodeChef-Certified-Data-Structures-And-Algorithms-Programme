import java.io.*;
import java.util.*;

class DFS {

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
            int destin = nextInt();
            adj.get(source).add(destin);
            adj.get(destin).add(source);

        }

        int vis[] = new int[vertices + 1];
        List<Integer> dfslist = new ArrayList<>();

        for (int i = 1; i < vis.length; i++) {
            if (vis[i] == 0) {
                dfs(i, adj, vis, dfslist);
            }
        }
        System.out.println(adj);
        System.out.println(dfslist);
    }

    public static void dfs(int index, List<List<Integer>> adj, int[] vis, List<Integer> dfslist) {
        dfslist.add(index);
        vis[index] = 1;

        for (int i : adj.get(index)) {
            if (vis[i] == 0) {
                dfs(i, adj, vis, dfslist);
            }
        }
    }
}
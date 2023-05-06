import java.util.*;
import java.io.*;

// using bfs
public class RedundantCycle {
    static StringTokenizer st;
    static BufferedReader br;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = nextInt();
        while (t-- > 0) {
            input();
        }
        br.close();
    }

    static void input() throws IOException {
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
        System.out.println(Arrays.toString(bfs(adj, vis)));
    }

    static int[] bfs(List<List<Integer>> adj, int vis[]) {
        // List<Integer> bfs = new ArrayList<>();
        for (int i = 1; i < vis.length; i++) {
            if (vis[i] == 0) {
                return cycle(i, adj, vis);
            }
        }
        return new int[] { 0, 0 };
    }

    static int[] cycle(int ind, List<List<Integer>> adj, int[] vis) {
        List<List<Integer>> t = new LinkedList<>();
        List<Integer> ele = new ArrayList<>();
        ele.add(-1);
        ele.add(ind);
        t.add(new ArrayList<>(ele));
        ele.clear();
        while (!t.isEmpty()) {
            int par = t.get(0).get(0);
            int node = t.get(0).get(1);
            t.remove(0);
            for (int it : adj.get(node)) {
                if (vis[it] == 0) {
                    ele.add(node);
                    ele.add(it);
                    t.add(new ArrayList<>(ele));
                    ele.clear();
                    vis[it] = 1;
                } else if (par != it) {
                    return (new int[] { par, it });
                }
            }
        }
        return (new int[] { 0, 0 });
    }
}

/**
 * the above code give the edge where the cycle in the graph closes where
 * we can brake in order from 1 to n.
 * 
 * the below code is in the order of the edges[][] array input thus gives the
 * right answer also below code just follows a flow if value same in parent[]
 * array then cycle exist
 * 
 */
// ----------------------------------------------------------------------------------------
class Solution {
    int[] parent = null;

    private int find_root(int n) {
        if (parent[n] == n)
            return n;
        return find_root(parent[n]);
    }

    private void make_union(int n, int m) {
        parent[n] = m;
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int[] edge = edges[i];
            int r1 = find_root(edge[0]);
            int r2 = find_root(edge[1]);

            if (r1 == r2) {
                return edge;
            } else {
                make_union(r1, r2);
            }
        }
        return null;
    }
}
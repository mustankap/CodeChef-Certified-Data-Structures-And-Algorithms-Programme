import java.util.*;
import java.io.*;

class Node {
    int par, child;

    Node(int par, int child) {
        this.child = child;
        this.par = par;
    }
}

// using bfs
public class DetectCycleInUndirectedGraph {
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
        boolean result = bfs(adj, vis);
        System.out.println(result);
    }

    static boolean bfs(List<List<Integer>> adj, int vis[]) {
        // List<Integer> bfs = new ArrayList<>();
        for (int i = 1; i < vis.length; i++) {
            if (vis[i] == 0) {
                if (cycle(i, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean cycle(int ind, List<List<Integer>> adj, int[] vis) {
        Queue<Node> t = new LinkedList<>();
        t.add(new Node(-1, ind));
        while (!t.isEmpty()) {
            int par = t.peek().par;
            int node = t.peek().child;
            t.remove();
            for (int it : adj.get(node)) {
                if (vis[it] == 0) {
                    t.add(new Node(node, it));
                    vis[it] = 1;
                } else if (par != it) {
                    return true;
                }
            }
        }
        return false;
    }
}

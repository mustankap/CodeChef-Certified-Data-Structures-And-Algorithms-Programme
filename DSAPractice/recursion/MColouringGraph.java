import java.io.*;
import java.util.*;

class MColouringGraph {
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
        System.out.println(adj);

        int m = nextInt();
        int col[] = new int[vertices + 1];

        System.out.println(graphColoring(1, m, col, adj));

    }

    static boolean graphColoring(int ind, int m, int[] col, List<List<Integer>> adj) {
        if (ind == col.length - 1) {
            return true;
        }

        for (int i = 1; i <= m; i++) {
            if (safe(ind, adj, col, i)) {
                col[ind] = i;
                if (graphColoring(ind + 1, m, col, adj)) {
                    return true;
                }
                col[ind] = 0;
            }
        }
        return false;
    }

    static boolean safe(int node, List<List<Integer>> adj, int[] col, int presentcol) {
        for (int it : adj.get(node)) {
            if (col[it] == presentcol)
                return false;
        }
        return true;
    }
}
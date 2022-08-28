import java.io.*;
import java.util.*;

class BipatriteDFSColouring {
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
        int col[] = new int[vertices + 1];
        Arrays.fill(col, -1);
        System.out.println(dfs(adj, col));

    }

    static boolean dfs(List<List<Integer>> adj, int[] col) {
        for (int i = 1; i < col.length; i++) {
            if (col[i] == -1) {
                if (!dfs(i, adj, col)) {
                    return false;
                }

            }
        }
        return true;
    }

    static boolean dfs(int node, List<List<Integer>> adj, int[] col) {

        if (col[node] == -1) {
            col[node] = 1;
        }

        for (int it : adj.get(node)) {
            if (col[it] == -1) {
                col[it] = 1 - col[node];

                if (!dfs(it, adj, col))
                    return false;
            } else if (col[node] == col[it]) {
                return false;
            }
        }

        return true;
    }
}
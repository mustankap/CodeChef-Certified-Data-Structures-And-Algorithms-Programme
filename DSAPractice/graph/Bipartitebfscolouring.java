import java.io.*;
import java.util.*;

class Bipartitebfscolouring {
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

        boolean result = bfs(vis, adj, vertices);
        System.out.println(result);
    }

    static boolean bfs(int[] vis, List<List<Integer>> adj, int vertices) {

        int colour[] = new int[vertices + 1];
        for (int i = 1; i < vertices + 1; i++) {
            colour[i] = -1;
        }
        for (int i = 1; i < vis.length; i++) {
            if (vis[i] == 0) {
                if (colour[i] == -1) {
                    if (!bfs(adj, i, colour)) {
                        return false;
                    }

                }

            }
        }
        return true;

    }

    static boolean bfs(List<List<Integer>> adj, int node, int[] colour) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        colour[node] = 1;
        while (!q.isEmpty()) {
            int no = q.poll();
            for (int it : adj.get(no)) {
                if (colour[it] == -1) {
                    colour[it] = 1 - colour[no];
                    q.add(it);
                } else if (colour[it] == colour[no]) {
                    return false;
                }
            }
        }

        return true;
    }
}

import java.io.*;
import java.util.*;

class BFS {
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
        int vertex = nextInt();
        int edges = nextInt();
        List<List<Integer>> adjecencyList = new ArrayList<>();
        for (int i = 0; i < vertex + 1; i++) {
            adjecencyList.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int source = nextInt();
            int destination = nextInt();
            adjecencyList.get(source).add(destination);
            adjecencyList.get(destination).add(source);// because this is undirected
        }

        System.out.println(adjecencyList);
        int vis[] = new int[vertex + 1];
        bfs(vis, adjecencyList);
    }

    public static void bfs(int[] vis, List<List<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        for (int i = 1; i < vis.length; i++) {
            if (vis[i] == 0) {
                Queue<Integer> trav = new LinkedList<>();
                trav.add(i);
                vis[i] = 1;
                while (!trav.isEmpty()) {
                    int node = trav.poll();
                    bfs.add(node);

                    for (int it : adj.get(node)) {
                        if (vis[it] == 0) {
                            vis[it] = 1;
                            trav.add(it);

                        }
                    }

                }
            }
        }

        System.out.println("The bfs is:");
        System.out.println(bfs);
    }

}

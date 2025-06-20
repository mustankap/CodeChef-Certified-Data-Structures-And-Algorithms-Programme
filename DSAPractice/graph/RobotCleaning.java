import java.io.*;
import java.util.*;

public class RobotCleaning {

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
    int n = nextInt();
  }
}
/**

  bool isvalid(int x, int y, int n, int m)
{
    return (x < n && x >= 0 && y < m && y >= 0);
}
void dfs(vector<string> &g, const int &n, const int &m, vector<vector<bool>> &vis, int x, int y)
{
    vis[x][y] = true;
    if (isvalid(x + 1, y, n, m) && !vis[x + 1][y] && g[x + 1][y] != '#')
    {
        dfs(g, n, m, vis, x + 1, y);
    }
    if (isvalid(x - 1, y, n, m) && !vis[x - 1][y] && g[x - 1][y] != '#')
    {
        dfs(g, n, m, vis, x - 1, y);
    }
    if (isvalid(x, y + 1, n, m) && !vis[x][y + 1] && g[x][y + 1] != '#')
    {
        dfs(g, n, m, vis, x, y + 1);
    }
    if (isvalid(x, y - 1, n, m) && !vis[x][y - 1] && g[x][y - 1] != '#')
    {
        dfs(g, n, m, vis, x, y - 1);
    }
}
int solution(vector<string> &plan)
{
    int n = plan.size();
    int m = plan[0].size();

    int ans = 0;
    vector<vector<bool>> vis(n, vector<bool>(m, false));

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (plan[i][j] == '*' && !vis[i][j])
            {
                ans++;
                dfs(plan, n, m, vis, i, j);
            }
        }
    }

    return ans;
}



}
 */

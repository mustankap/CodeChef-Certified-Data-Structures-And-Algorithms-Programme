import java.io.*;
import java.util.*;

class missing_invoices {
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
            int no_of_companies = nextInt();
            
            company(no_of_companies);
        }
        br.close();
    }

    public static void company(int no_of_companies)throws IOException
    {
       while(no_of_companies-- >0)
        {String com = next();
        input(com);}


    }
    public static void input(String com) throws IOException {
        int n = nextInt();

        int intervals[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
    
            intervals[i][0] = nextInt();
            intervals[i][1] = nextInt();
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // System.out.println("/////////////////////");
        // for (int[] interval : intervals)
        //     System.out.println(Arrays.toString(interval));
        // System.out.println("////////////////////////");
        List<Integer> ans = new ArrayList<>();
        List<int[]> l = new ArrayList<>();
        for (int[] interval : intervals) {
            // for (int[] m : l)
            //     System.out.println(Arrays.toString(m));
            // System.out.println("--------------------------");

            if (l.isEmpty()) {
                l.add(interval);
            } else if (l.get(l.size() - 1)[1] < interval[0]  && interval[0]-l.get(l.size() - 1)[1]!=1  ) {
                int counter = l.get(l.size() - 1)[1]+1;
                while (counter < interval[0]) {
                    ans.add(counter++);

                }
                l.add(interval);
            } else {
                l.add(interval);
                continue;
            }
        }

        System.out.println("For "+com+", missing invoices are: "+ans);
    }
}
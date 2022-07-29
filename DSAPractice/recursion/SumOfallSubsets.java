import java.io.*;
import java.util.*;

class SumOfallSubsets {
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
        List<Integer> a = new ArrayList<>(n);

        for(int i=0;i<n;i++)
            a.add(nextInt());

        List<Integer> obs = subsetsums(a,n);
        System.out.println(Arrays.toString(obs.toArray()));
    }

    public static List<Integer> subsetsums(List<Integer> arr, int N)
    {
        List<Integer> nums = new ArrayList<>();
        sub(nums,arr,0,N-1,0);
        return nums;

    }
    public static void sub(List<Integer> nums, List<Integer> arr,int l,int r,int sum)
    {
        if(l>r)
        {
            nums.add(sum);return;

        }
        sub(nums,arr,l+1, r, sum+arr.get(l));
        sub(nums,arr,l+1, r, sum);
        

    }
}
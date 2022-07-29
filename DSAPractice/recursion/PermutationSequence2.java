import java.io.*;
import java.util.*;
//https://leetcode.com/problems/permutation-sequence/
public class PermutationSequence2 {
    static BufferedReader br;
    static StringTokenizer st;
    PermutationSequence ps = new PermutationSequence();

    static int nextInt()throws IOException
    {
        return Integer.parseInt(next());
    }

    static String next()throws IOException
    {
        while(st == null || !st.hasMoreTokens())
        {
            st=new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public static void main(String[] args)throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = nextInt();
        int k = nextInt();
        System.out.println(getPermutation(n, k));
    }

    public static String getPermutation(int n, int k) {
        String nums = "";
        for (int i = 0; i < n; i++) {
            nums += (i + 1);
        }
        List<String> ans = new ArrayList<>();
        permute(nums.toCharArray(), ans, 0, n - 1);
        Collections.sort(ans);

        return (ans.get(k - 1));
    }

    static void permute(char[] nums, List<String> ans, int l, int r) {
        if (l == r) {
            String str = new String(nums);
            ans.add(str);
        } else {
            for (int i = l; i <= r; i++) {
                nums = swap(nums, l, i);
                permute(nums, ans, l + 1, r);
                nums = swap(nums, l, i);
            }
        }
    }

    static char[] swap(char[] nums, int l, int i) {
        char ch;
        ch=nums[i];
        nums[i]=nums[l];
        nums[l]=ch;
        return nums;
    }
    
    
    
}
import java.io.*;
import java.util.*;

//https://leetcode.com/problems/permutation-sequence/
public class PermutationSequence {
    static BufferedReader br;
    static StringTokenizer st;
    PermutationSequence ps = new PermutationSequence();

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int n = nextInt();
        int k = nextInt();
        System.out.println(getPermutation(n, k));
    }

    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(i + 1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, ans, 0, n - 1);

        Collections.sort(ans, new Comparator<List<Integer>>() {

            @Override
            public int compare(List<Integer> val1, List<Integer> val2) {
                if (val1.get(0) > val2.get(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        System.out.println(ans);
        StringBuilder sb = new StringBuilder();
        nums = ans.get(k - 1);
        int i = 0;
        while (i < nums.size() - 1) {
            sb.append(nums.get(i));

            i++;
        }
        sb.append(nums.get(i));

        String res = sb.toString();
        return res;

    }

    static void permute(List<Integer> nums, List<List<Integer>> ans, int l, int r) {
        if (l == r)
            ans.add(new ArrayList<>(nums));
        else {

            for (int i = l; i <= r; i++) {
                nums = swap(nums, l, i);
                permute(nums, ans, l + 1, r);
                nums = swap(nums, l, i);
            }
        }
    }

    static List<Integer> swap(List<Integer> nums, int l, int i) {
        int temp;
        temp = nums.get(i);
        nums.set(i, nums.get(l));
        nums.set(l, temp);
        return nums;
    }

}
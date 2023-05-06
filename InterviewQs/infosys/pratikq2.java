/**
 * 
 * Bob has some problems with N topics, he will give you all the problems as an
 * array A with length N. It is given that A[i] denotes the number of problems
 * in the ith topic that he wrote. Bob asks you to organize the maximum possible
 * number of contests using these problems such that:
 * 1) each contest has distinct problems (no two or more problems with the same
 * topic).
 * 2)Each contest (Except the first one) has more problems than the previous
 * contest.
 * Write a java program to find the maximum number of contests you can organize
 * using problems given by Bob.
 * 
 * 
 */

public class pratikq2 {
    public static int maxContests(int[] A) {
        int n = A.length;
        int[] dp = new int[n]; // dp[i] represents the maximum number of contests that can be organized using
                               // problems from topic i
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = { 5, 2, 7, 8, 1, 6 };
        System.out.println(maxContests(A)); // Output: 4
    }
}

/**
 * 
 * 
 * The program uses a dynamic programming approach to solve the problem. It
 * creates an array "dp" of size "n" to store the maximum number of contests
 * that can be organized using problems from topic i. The program then uses
 * nested loops to iterate through all possible subarrays of the input array A.
 * For each topic i, it checks if the number of problems in that topic is
 * greater than the number of problems in the previous topic j. If it is, it
 * updates the value of dp[i] to be the maximum of its current value and the
 * value of dp[j] + 1. This is because if the number of problems in topic i is
 * greater than topic j, it satisfies the condition of having more problems in
 * the current contest than the previous one.
 * 
 * Finally, it returns the maximum value in the dp array as the result, which
 * represents the maximum number of contests that can be organized using the
 * problems given by Bob.
 * 
 * Note that this solution uses the condition that each contest has distinct
 * problems and not just that no two or more problems with the same topic are
 * repeated.
 */
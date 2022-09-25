
/** */
import java.util.*;

public class maximumbitwiseor {

    // Function to convert bit array to
    // decimal number
    static int build_num(int bit[]) {
        int ans = 0;

        for (int i = 0; i < 32; i++)
            if (bit[i] > 0)
                ans += (1 << i);

        return ans;
    }

    // Function to find maximum values of
    // each bitwise OR operation on
    // element of subarray of size K
    static int maximumOR(int arr[], int n, int k) {
        // Maintain an integer array bit[]
        // of size 32 all initialized to 0
        int bit[] = new int[32];

        // Create a sliding window of size k
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 32; j++) {
                System.out.println("i=" + i + ", j=" + j);
                if ((arr[i] & (1 << j)) > 0) {
                    bit[j]++;
                    System.out.println(bit);
                }
            }
        }

        System.out.println(Arrays.toString(bit));
        // Function call
        int max_or = build_num(bit);

        for (int i = k; i < n; i++) {

            // Perform operation for
            // removed element
            for (int j = 0; j < 32; j++) {
                if ((arr[i - k] & (1 << j)) > 0)
                    bit[j]--;
            }

            // Perform operation for
            // added_element
            for (int j = 0; j < 32; j++) {
                if ((arr[i] & (1 << j)) > 0)
                    bit[j]++;
            }

            // Taking maximum value
            max_or = Math.max(build_num(bit), max_or);
        }

        // Return the result
        return max_or;
    }

    // Driver Code
    public static void main(String[] args) {
        // Given array arr[]
        int arr[] = { 2, 5, 3, 6, 11, 13 };

        // Given subarray size K
        int k = 3;
        int n = arr.length;

        // Function Call
        System.out.print(maximumOR(arr, n, k));
    }
}

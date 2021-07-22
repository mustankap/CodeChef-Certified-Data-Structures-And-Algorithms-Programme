import java.util.*;
/*
* https://www.geeksforgeeks.org/minimum-characters-required-to-be-removed-to-make-frequency-of-each-character-unique/
*/

// Java program to implement
// the above approach

public class min_freq_char_unique {

    // Function to find the minimum count of
    // characters required to be deleted to make
    // frequencies of all characters unique
    static int minCntCharDeletionsfrequency(char[] str, int N) {
        // Stores frequency of each
        // distinct character of str
        HashMap<Character, Integer> mp = new HashMap<>();

        // Store frequency of each distinct
        // character such that the largest
        // frequency is present at the top
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));

        // Stores minimum count of characters
        // required to be deleted to make
        // frequency of each character unique
        int cntChar = 0;

        // Traverse the String
        for (int i = 0; i < N; i++) {
            // Update frequency of str[i]
            if (mp.containsKey(str[i])) {
                mp.put(str[i], mp.get(str[i]) + 1);
            } else {
                mp.put(str[i], 1);
            }
        }

        // Traverse the map
        for (Map.Entry<Character, Integer> it : mp.entrySet()) {
            // Insert current
            // frequency into pq
            pq.add(it.getValue());
        }

        // Traverse the priority_queue
        while (!pq.isEmpty()) {
            // Stores topmost
            // element of pq
            int frequent = pq.peek();

            // Pop the topmost element
            pq.remove();

            // If pq is empty
            if (pq.isEmpty()) {

                // Return cntChar
                return cntChar;
            }

            // If frequent and topmost
            // element of pq are equal
            if (frequent == pq.peek()) {
                // If frequency of the topmost
                // element is greater than 1
                if (frequent > 1) {
                    // Insert the decremented
                    // value of frequent
                    pq.add(frequent - 1);
                }

                // Update cntChar
                cntChar++;
            }
        }

        return cntChar;
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "abbbcccd";

        // Stores length of str
        int N = str.length();
        System.out.print(minCntCharDeletionsfrequency(str.toCharArray(), N));
    }
}

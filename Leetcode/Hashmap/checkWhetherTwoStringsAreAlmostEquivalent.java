/**
 * 
 * import java.io.*;
import java.util.*;

public class checkWhetherTwoStringsAreAlmostEquivalent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        HashMap<Character, Integer> word1hm = new HashMap<Character, Integer>();
        HashMap<Character, Integer> word2hm = new HashMap<Character, Integer>();

        char[] word1arr = word1.toCharArray();
        char[] word2arr = word2.toCharArray();

        for (char c : word1arr) {
            if (word1hm.containsKey(c)) {
                word1hm.put(c, word1hm.get(c) + 1);
            } else {
                word1hm.put(c, 1);
            }
        }

        for (char d : word2arr) {
            if (word2hm.containsKey(d)) {
                word2hm.put(d, word2hm.get(d) + 1);
            } else {
                word2hm.put(d, 1);
            }
        }
        List<Integer> arr = new ArrayList<>();
        int c = 0;
        if (word1hm.size() <= word2hm.size()) {
            for (Map.Entry<Character, Integer> entry1 : word1hm.entrySet()) {
                arr.add(Math.abs(entry1.getValue() - word2hm.get(entry1.getKey())));
                c++;
            }

            for (int i = c; i < word2hm.size(); i++) {
                arr.add(word2hm.get(i));
            }
        } else {
            for (Map.Entry<Character, Integer> entry2 : word2hm.entrySet()) {
                arr.add(Math.abs(entry2.getValue() - word1hm.get(entry1.getKey())));
                c++;
            }

            for (int i = c; i < word1hm.size(); i++) {
                arr.add(word1hm.get());
            }
        }

        int flag = 0;

        for (int s = 0; s < arr.size(); s++) {
            if (arr.get(s) > 3) {
                break;
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        // System.out.println(word1hm.toString());
        // System.out.println(word2hm.toString());

    }
}
*/


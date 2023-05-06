import java.io.*;
import java.util.*;

class FirstLettertoAppearTwice {
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
        String s = next();
        System.out.println(repeatedCharacter(s));

    }

    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> rel = new LinkedHashMap<>();
        int i, j;

        for (i = 0; i < s.length(); i++) {
            for (j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (!rel.containsKey(s.charAt(i))) {
                        rel.put(s.charAt(i), j);
                    }

                }
            }

        }

        rel = sortByValue(rel);
        Iterator hmIterator = rel.entrySet().iterator();
        if (hmIterator.hasNext()) {

            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            return ((char) mapElement.getKey());
        } else
            return 'v';

    }

    public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) {

        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(
                hm.entrySet());

        Collections.sort(
                list,
                new Comparator<Map.Entry<Character, Integer>>() {
                    public int compare(
                            Map.Entry<Character, Integer> object1,
                            Map.Entry<Character, Integer> object2) {
                        return (object1.getValue())
                                .compareTo(object2.getValue());
                    }
                });

        // putting the data from sorted list back to hashmap
        HashMap<Character, Integer> result = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> me : list) {
            result.put(me.getKey(), me.getValue());
        }
        return result;

    }
}

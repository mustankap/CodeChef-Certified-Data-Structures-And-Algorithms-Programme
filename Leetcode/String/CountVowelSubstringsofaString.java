
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class CountVowelSubstringsofaString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        System.out.println(Count_Vowel_Substrings_of_a_String(w));

    }

    public static int Count_Vowel_Substrings_of_a_String(String word) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < word.length(); i++) {
            Stack<Integer> st = new Stack<>();
            if (word.charAt(i) == 'a'||word.charAt(i) == 'e'||word.charAt(i) == 'i'||word.charAt(i) == 'o'||word.charAt(i) == 'u') {
                vowels.remove(vowels.indexof(word.charAt(i)));
                st.push(word.charAt(i));
                if(st.contains("a") && st.contains("e") && st.contains("i") && st.contains("o") && st.contains("u"))
                {
                    st.size()
                }
            }else {
                st.clear();
                vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
                continue;

            }

        }

        return 0;

    }
}

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class MinimumCharacters {

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
    String sourceString = "1234";
    List<String> stringList = List.of("123", "1234", "321", "1200");
    List<Integer> minimumCharacters = countMinimumCharacters(
      sourceString,
      stringList
    );
    System.out.println(minimumCharacters); // Output: [1, 4, -1, 2]
  }

  public static List<Integer> countMinimumCharacters(
    String sourceString,
    List<String> stringList
  ) {
    int n = sourceString.length();
    List<List<Integer>> charIndices = new ArrayList<>();

    // Initialize charIndices with empty lists for each digit (0-9)
    for (int i = 0; i < 10; i++) {
      charIndices.add(new ArrayList<>());
    }

    // Build a list of indices for each digit in the source string
    for (int i = 0; i < n; i++) {
      charIndices.get(sourceString.charAt(i) - '0').add(i + 1);
    }

    List<Integer> result = new ArrayList<>();
    for (String targetString : stringList) {
      int[] charCounts = new int[10]; // Count occurrences of each digit in the current string

      // Count occurrences of each digit in the target string
      for (char c : targetString.toCharArray()) {
        charCounts[c - '0']++;
      }

      boolean isPossible = true;
      int minLastIndex = 0;

      // Check if characters can be formed from source string
      for (int i = 0; i < 10; i++) {
        if (charCounts[i] == 0) {
          continue;
        }
        if (charCounts[i] > charIndices.get(i).size()) {
          isPossible = false;
          minLastIndex = -1;
          break;
        } else {
          // Find the last index needed for the current digit count
          minLastIndex =
            Math.max(minLastIndex, charIndices.get(i).get(charCounts[i] - 1));
        }
      }

      result.add(isPossible ? minLastIndex : -1);
    }

    return result;
  }
}

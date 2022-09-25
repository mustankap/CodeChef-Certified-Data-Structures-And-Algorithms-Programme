import java.io.*;
import java.util.*;

class SortthePeople {
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
        int heights[] = new int[n];
        String names[] = new String[n];

        for (int i = 0; i < n; i++) {
            heights[i] = nextInt();
        }

        for (int i = 0; i < n; i++) {
            names[i] = next();
        }

        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    static String[] sortPeople(String[] names, int[] heights) {
        quickSort(heights, names, 0, heights.length - 1);
        return names;

    }

    static void quickSort(int[] heights, String[] names, int low, int high) {
        if (low < high) {

            int pi = partition(heights, names, low, high);

            quickSort(heights, names, low, pi - 1);
            quickSort(heights, names, pi + 1, high);
        }
    }

    static int partition(int[] heights, String[] names, int low, int high) {

        int pivot = heights[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (heights[j] > pivot) {

                i++;
                swap(heights, i, j);
                swap(names, i, j);

            }
        }
        swap(heights, i + 1, high);
        swap(names, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] heights, int i, int j) {
        int temp = heights[i];
        heights[i] = heights[j];
        heights[j] = temp;
    }

    static void swap(String[] names, int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }

}
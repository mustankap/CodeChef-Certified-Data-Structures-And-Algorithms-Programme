import java.io.*;
import java.util.*;

public class SortColorsQuickSort {

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
    int nums[] = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = nextInt();
    }

    quickSort(nums, 0, n - 1);
    System.out.println(Arrays.toString(nums));
  }

  public static void quickSort(int[] nums, int l, int h) {
    if (l < h) {
      int pIndex = partition(nums, l, h);
      quickSort(nums, l, pIndex - 1);
      quickSort(nums, pIndex + 1, h);
    }
  }

  public static int partition(int[] nums, int l, int h) {
    int pivot = nums[l];
    int j = h;
    int i = l;
    while (i < j) {
      while (nums[i] <= pivot && i <= h - 1) {
        i++;
      }

      while (nums[j] > pivot && j >= l + 1) {
        j--;
      }

      if (i < j) swap(i, j, nums);
    }
    swap(l, j, nums);
    return j;
  }

  public static void swap(int i, int j, int[] nums) {
    int c = nums[i];
    nums[i] = nums[j];
    nums[j] = c;
  }
}

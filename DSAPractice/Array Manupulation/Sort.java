import java.io.*;
import java.util.*;

public class Sort {

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
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = nextInt();
    }
    recurInsertionSort(arr, n);
  }

  public static void insertionSort(int[] arr, int size) {
    //Your code goes here

    for (int i = 0; i < size; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        arr[j] = arr[j - 1] + arr[j];
        arr[j - 1] = arr[j] - arr[j - 1];
        arr[j] = arr[j] - arr[j - 1];
        j--;
      }
    }
  }

  public static void recurInsertionSort(int[] arr, int size) {
    if (size < 1) return;

    recurInsertionSort(arr, size - 1);
    //Your code goes here
    // System.out.println("the value of size:" + size);
    if (size == arr.length) return;
    int j = size;
    while (j > 0 && arr[j - 1] > arr[j]) {
      arr[j] = arr[j - 1] + arr[j];
      arr[j - 1] = arr[j] - arr[j - 1];
      arr[j] = arr[j] - arr[j - 1];
      j--;
      // System.out.println("the value of j after swap:" + j);
      // System.out.println("array now:" + Arrays.toString(arr));
    }
  }

  public static void mergeSort(int[] arr, int low, int high) {
    // Write your code here
    if (low == high) return;
    int mid = (low + high) / 2;

    mergeSort(arr, low, mid);

    mergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  public static void merge(int[] arr, int low, int mid, int high) {
    List<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }
}

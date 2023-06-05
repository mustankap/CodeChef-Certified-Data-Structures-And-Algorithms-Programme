/**
 * A circular key is given with n integer
 * one rotates it k times
 * after rotating it k times
 *
 *
 *
 *
 * if >10
 * if <10
 *
 */

import java.io.*;
import java.util.*;

public class rotatearray {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    String[] st = br.readLine().split(" ");
    // using temp list from behind and pasting it in the front
    List<Integer> ar = new ArrayList<Integer>(
      Collections.nCopies(st.length, 0)
    );

    for (int i = 0; i < ar.size(); i++) {
      ar.set(i, Integer.parseInt(st[i]));
    }

    //rotating th array using extra list named temp
    List<Integer> temp = new ArrayList<Integer>();
    for (int i = n - 1; i > n - 1 - k; i--) {
      temp.add(Integer.parseInt(st[i]));
      ar.remove(ar.size() - 1);
    }
    Collections.reverse(temp);
    temp.addAll(ar);

    System.out.println(temp.toString());
  }
}
//checkout leetcode rotate array

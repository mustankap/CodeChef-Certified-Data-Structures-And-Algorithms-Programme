/**
 * 
 */
package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author Mustansir
 *
 */
public class TwoSets {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        

                int prod = (n * (n + 1)) / 2;
                if (prod % 2 != 0)
                    System.out.println("NO");
                else {
                    HashSet<Integer> set1 = new HashSet<>();
                    HashSet<Integer> set2 = new HashSet<>();
                    int i;
                    int j = n;
                    if (n % 2 == 0) {
                        i = 1;
                    } else {
                        set1.add(1);
                        set1.add(2);
                        set2.add(3);
                        i = 4;
                    }
                    while (i <= j) {
                        set1.add(i);
                        ++i;
                        set2.add(i);
                        ++i;
                        set1.add(j);
                        --j;
                        set2.add(j);
                        --j;
                    }
                    System.out.println("YES");
                    System.out.println(set1.size());
                    StringBuilder str1 = new StringBuilder();
                    for (int x : set1)
                        str1.append(x).append(" ");
                    System.out.println(str1.toString());
                    System.out.println(set2.size());
                    StringBuilder str2 = new StringBuilder();
                    for (int x : set2)
                        str2.append(x).append(" ");
                    System.out.println(str2.toString());
                }
           
	}

}

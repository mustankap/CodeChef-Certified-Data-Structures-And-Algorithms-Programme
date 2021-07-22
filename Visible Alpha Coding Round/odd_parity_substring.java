/* "  1 0 0 1 1 1 0 ""
* i= 0 1 2 3 4 5 6
*
*   https://www.geeksforgeeks.org/find-max-length-odd-parity-substring/
*/
import java.util.*;
public class odd_parity_substring
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int n = str.length();
        int cnt = 0;
        
        for (int i = 0; i < n; i++)
            if (str.charAt(i) == '1')
                cnt++;
 
        // If there are only 0s in the string
        if (cnt == 0)
            System.out.println(0);
 
        // If the count of 1s is odd then
        // the complete string has odd parity
        if (cnt % 2 == 1)
            System.out.println(n);
        else{
        // Index of the first and the second
        // occurrences of '1' in the string
        System.out.println(n);
        int firstOcc = str.indexOf('1');//0
        System.out.println(firstOcc);
        int secondOcc = str.indexOf('1', firstOcc + 1);//3
        System.out.println(secondOcc);
        // Index of the last and the second last
        // occurrences of '1' in the string
        int lastOcc = str.lastIndexOf('1');//5
        System.out.println(lastOcc);
        //int secondLastOcc = str.lastIndexOf('1', lastOcc - 1);
 
        // Result will the sub-string ending just
        // before the last occurrence of '1' or the
        // sub-string starting just after the first
        // occurrence of '1'
        // choose the one with the maximum length
        System.out.println(Math.max(lastOcc, n - firstOcc - 1));
        sc.close();
        }
    }
}


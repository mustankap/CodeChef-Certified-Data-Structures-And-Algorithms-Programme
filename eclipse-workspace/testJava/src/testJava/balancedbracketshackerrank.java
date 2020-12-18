package testJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class balancedbracketshackerrank {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        int i;
        Stack<Character> st = new Stack<Character>();
        for(i=0;i<s.length();i++)
        {   
            if((int)s.charAt(i)==40)
            {
                st.push(s.charAt(i));
            }
            else if((int)s.charAt(i)==91)
            {
                st.push(s.charAt(i));
            }
            else if((int)s.charAt(i)==123)
            {
                st.push(s.charAt(i));
            }
            else if(i!=0&&(int)s.charAt(i)==125)
            {
               if((int)st.peek()==123)
                    st.pop();
            }
            else if(i!=0&&(int)s.charAt(i)==93)
            {
                if((int)st.peek()==91)
                    st.pop();
            }
            else if(i!=0&&(int)s.charAt(i)==41)
            {
                if((int)st.peek()==40)
                    st.pop();
            }
        }
        if(st.isEmpty())
        {
            return "YES";

        }
        else
        {
            return "NO";
        }
            

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}


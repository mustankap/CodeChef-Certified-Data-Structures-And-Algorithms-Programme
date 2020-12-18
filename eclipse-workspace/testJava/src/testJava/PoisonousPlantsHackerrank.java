import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PoisonousPlantsHackerrank {

    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {
    int rej[]=new int[];int day;
    int acc[]=new int[];
    Stack<Integer> stack=new Stack<Integer>();
    stack.push(p[0]);
    rej[]={1};
     while(rej[0]!=0)
    {
    for(i=1;i<p.length;p++){
    if(p[i]>stack.peek())
    {
    rej[i-1]=p[i];
    }
    else
    {
        acc[i-1]=p[i];
    }
    
    stack.push(p[i]);
    }day++;
    for(h=0;h<rej.length;h++)
    {
        rej[h]=0;    }
    stack.clear();
    
    for(k=0;k<acc.length;k++)
    {
        stack.push(acc[k]);
    }
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int result = poisonousPlants(p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

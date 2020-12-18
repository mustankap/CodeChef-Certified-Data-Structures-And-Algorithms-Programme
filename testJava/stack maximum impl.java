import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),q,no;
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        while(n--!=0)
        {
         q=sc.nextInt();
         switch(q)
         {
             case 1:
             no=sc.nextInt();
             stack.push(no);
             break;
             
             case 2:
             stack.pop();
             break;

             case 3:
             maxi(stack,stack2);
    
         }
        }
    }
    public static void maxi(Stack<Integer> stack,Stack<Integer> stack2)

    { Integer g;
     int max=Integer.MIN_VALUE;
     while(stack.empty())
     {
     g=stack.pop();
    
     if(g>max)
     {max=g;}

     stack2.push(g);
    }
    System.out.println(max);
    Integer m;
    while(stack2.empty())
    {
     m=stack2.pop();
     stack.push(m);
    }

      
    }
}

package heisenbug;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/contests/heisenbug-01/challenges/popularity-meter
public class popularitymeter {
	

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();
	        int n = sc.nextInt();
	        //n inputs
	        while(t-->0)
	        {  //each string in array
	        	int count =0;
	        	String likes[]=new String[n];
	            for(int i =0;i<n;i++)
	            {
	                likes[i]=sc.nextLine();
	            
	               char op=likes[i].charAt(likes[i].length()-1);
	               
	                //last character is an operator
	               //for same name +- 
	                if(op=='+')
	                    count++;
	                 if(op=='-')
	                    count--;
	             
	            }
	         
	         //adding same name and different name
	         System.out.println(count);
	        }
	    }
	    
	    
	   
	    
	}


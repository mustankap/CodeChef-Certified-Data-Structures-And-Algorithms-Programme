/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/problems/SALARY/
/* Name of the class has to be "Main" only if the class is public. */
class The_Minimum_Number_Of_Moves_SALARY
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	   // Scanner sc=new Scanner(System.in);
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        int n=Integer.parseInt(br.readLine());
	        //int[] arr=new int[n];
	        String[] line=br.readLine().trim().split(" ");
	        int min=Integer.MAX_VALUE;
	        int sum=0;
	        for(int i=0;i<n;i++){
	            sum+=Integer.parseInt(line[i]);
	            if((Integer.parseInt(line[i])<min))
	            min=Integer.parseInt(line[i]);
	        }
	        int moves=sum-(n*min);
	        System.out.println(moves);
	    }
	    }
	    catch(Exception e){
	        return;
	    }
	    
		// your code goes here
	}
}

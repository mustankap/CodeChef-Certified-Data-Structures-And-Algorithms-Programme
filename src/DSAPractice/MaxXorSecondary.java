package DSAPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxXorSecondary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int s[]=new int[n];
			
			for(int i =0;i<n;i++)
				s[i]=sc.nextInt();
			
			sub(s);
	}
	public static void sub(int arr[])
	{
		ArrayList<Integer> subset=new ArrayList<Integer>();
			      
			    
			    int index = 0;
			    subsetsUtil(arr, subset, index)  
	}
	public static void subsetsUtil(int[] A,ArrayList<Integer> subset,int index)
	{
		 
		    System.out.print(subset);
		    for(int i=index;i<A.length;i++)  
		    {   
		        
		        subset.add(A[i]);
		          
		       
		        subsetsUtil(A, subset, i + 1); 
		          
		        
		        subset.pop(-1)  
		    return;
	}

}

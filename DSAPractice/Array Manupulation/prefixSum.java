/*
*
*
*/

import java.io.*;
import java.util.*;
public class prefixSum
{
    static final int IBIG = 1000000007;
	public static void main(String[] args)throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, k;

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        System.out.println(solve(n, k));

    }
    
     static void fillPrefixSum(int arr[], int n,
                              int prefixSum[])
    {
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; ++i)
            prefixSum[i] = (prefixSum[i - 1]%IBIG + arr[i]%IBIG)%IBIG;
            
        
    }

    static int solve(int n, int k) {
        int arr[] = new int[n];
        int arr1[] = new int[n];
       
        
        for(int i =0; i<arr.length;i++)
        {
            arr[i]=i+1;            
        }
        
        for(int i =0; i<k;i++)
        {
        fillPrefixSum(arr,n,arr1);
        arr = arr1.clone();
        }
        
        List<Integer> con = new ArrayList<Integer>();
        for(int i =0; i<arr.length;i++)
        {
        
        con.add(i,arr[i]%10);
        
        }
        
    
        Collections.sort(con, Collections.reverseOrder());
        
        int[] com = con.stream().mapToInt(Integer::intValue).toArray();
        //List<Integer> ar = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
        return (arrayToInt(com));
        
	}
	
	static int arrayToInt(int[] arr)
    { String s =""; 
    
        for (int i : arr)
        {
             s+=i; 
        }
    
        return (Integer.parseInt(s)%IBIG); 
    }
}

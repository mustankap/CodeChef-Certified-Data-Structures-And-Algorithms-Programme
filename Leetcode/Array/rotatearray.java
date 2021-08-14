// https://leetcode.com/problems/rotate-array/

// right solution: took help from last approach of https://www.geeksforgeeks.org/array-rotation/
//55.8 mb
import java.util.*;
class rotatearray {
    public void rotate(int[] nums, int d) {
        
        int n = nums.length;
        d = d % n;
        int g_c_d =gcd(d,nums.length);
        
        int i , j ,temp,k=0;
        for(i = n-1; i > n-1-g_c_d ; i--)
        {   temp=nums[i];
            j=i;
            while(true)
            {   k=j-d;
                
                if(k<0)
                {
                    k=k+n;
                }
                if(k==i)
                    break;
                nums[j]=nums[k];
               j=k;  
            }
            nums[j] = temp;   
        }
        
        
    }
    public int gcd(int a,int b)
    {
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
        
    }
}

//faster solution but 1.2 more mb 56mb
/**
  class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    public static void reverse(int[]nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;end--;
        }
    }
}
**/
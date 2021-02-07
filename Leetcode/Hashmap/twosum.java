import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        
        for(int i=0; i<nums.length;i++) {
            numbers.put(Integer.toString(nums[i]),i);   
        }
        
        for(int i=0, place=i; i<nums.length;i++) {    
            
            int distance = target - nums[i];
            
            if (numbers.containsKey(Integer.toString(distance))) {
                place = numbers.get(Integer.toString(distance));
                if (i!=place){
                    return new int[]{i,place};
                }  
            }
        }
        
        return new int[]{0,0};
    }
}

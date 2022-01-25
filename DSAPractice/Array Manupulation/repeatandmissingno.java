
import java.util.*;

public class repeatandmissingno
{
	public static void main(String[] args) {
	int n = 47;
	int arr[]={13,33,43,16,25,19,23,31,29,35,10,2,32,11,47,15,34,46,30,26,41,18,5,17,37,39,6,4,20,27,9,3,8,40,24,44,14,36,7,38,12,1,42,12,28,22,45};
	
	    System.out.println(Arrays.toString(findTwoElement(arr,n)));
	}
	
	static int[] findTwoElement(int arr[], int n) {
        // code here
        int a=0,b=0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i =1;i<n;i++)
        {
            
            if(arr[i-1]!=i)
            {
                
                if(arr[i-1]==arr[i-2])
                {
                    b=arr[i-1];
                    
                }
                else
                {
                    a=i-1;
                }


                
            }
        }
        
        return new int[]{b,a};
    }
}

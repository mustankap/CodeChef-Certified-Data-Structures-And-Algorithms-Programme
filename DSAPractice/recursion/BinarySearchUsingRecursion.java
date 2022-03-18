
public class BinarySearchUsingRecursion
{
    final static int val = 8;
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int first = 0;
	    int last = arr.length-1;
	    System.out.println(BS(arr,first,last));
	}
	
	public static int BS(int[] arr,int first,int last)
	{
	   
	    int mid = (first-last)/2 + last;
	    if(first<=last)
	     {   if(val==arr[mid])
	        {
	            return mid;
	            
	        }
	        if(val>arr[mid])
	        {
	           return BS(arr,mid+1,arr.length-1);
	        }
	        else
	        {
	           return BS(arr,0,mid-1);
	            
	        }
	     }
	    else
	    {return -1;}
	    
	}
}

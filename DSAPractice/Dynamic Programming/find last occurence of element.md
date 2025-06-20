```java

public class Main
{
	public static void main(String[] args) {
	    int a[] = {3,3,6,7,7,9,9,11,11,11,11};
	System.out.println(lastOfUs(a,0,a.length-1,7));
	}
	
	public static int lastOfUs(int[] a, int f, int l,int q)
	{
	    int mid = (f+l)/ 2;
	    if((l-f)==1)
	    {
	        if(a[mid+1]==q)
	            return mid+1;
	        else if(a[mid]==q)
	            return mid;
	        else
	            return -1;
	            
	    }
	    
	    int left = lastOfUs(a,mid+1,l,q);
	    int right = lastOfUs(a,f,mid,q);
	    
	    if(left!=-1)
	        return left;
	    else
	        return right;
	}
}

```


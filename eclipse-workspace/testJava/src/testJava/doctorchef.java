/**
 * def dhoon(x, a):
    j = 0
    for i in a:
        if i <= x:
            j += 1
    if 2*a[j-1] < x or j < 1:
        return len(a)-1
    else:
        return j-1
    

t = int(input())
for x in range(t):
    n, x = map(int, input().split())
    a = list(map(int, input().split()))
    a.sort()
    ans = 0
    while a[-1] > 0:
        d = dhoon(x, a)
        if d == len(a)-1:
            max1 = 2 * (a[d] - x)
            if (max1 < a[d]):
                a[d] = max1
            x = x * 2
            ans = ans + 1
        elif d != len(a)-1:
            y = a.pop(d)
            x = 2 * y
            ans = ans + 1
    print(ans+len(a)-1)
 */
package testJava;
import java.util.*;
public class doctorchef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt(),i;
			int x = sc.nextInt();
			int a[]=new int[n];
			
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			int ans =0;
			Arrays.parallelSort(a);
			 
			while(a[n-1]>0)
			{
				int d = dhoon(x, a);
				        if(d == a.length-1)
				            {int max1 = 2 * (a[d] - x);
				            if (max1 < a[d])
				                a[d] = max1;
				            x = x * 2;
				            ans = ans + 1;
				            }
				        else if (d != a.length-1)
				            {int y=a[d];
				             a=removeTheElement(a,d);
				             x = 2 * y;
				             ans = ans + 1;
				            }
				        System.out.println(ans+a.length-1);
				        
				        
			}
		}

	}
	
	public static int[] removeTheElement(int[] arr, int index) 
	{ 

// If the array is empty 
// or the index is not in array range 
// return the original array 
		if (arr == null|| index < 0|| index >= arr.length) 
		{ 

			return arr; 
		} 

// Create another array of size one less 
		int[] anotherArray = new int[arr.length - 1]; 

// Copy the elements except the index 
// from original array to the other array 
		for (int i = 0, k = 0; i < arr.length; i++)
		{ 

// if the index is 
// the removal element index 
			if (i == index) { 
				continue; 
			} 

// if the index is not 
// the removal element index 
			anotherArray[k++] = arr[i]; 
		} 

// return the resultant array 
		return anotherArray; 
	} 
	public static int dhoon(int x, int a[])
	{
		int j = 0;
			    for (int i : a)
			    { if (i <= x)
			            {j += 1;}
			    }
			    if(j!=0)
			    {
			    if((2*a[j-1]) < x || j < 1)
			    { return a.length-1;}
			    else
			        {return j-1;}
			    }
			    else
			    {
			    	return a.length-1;
			    }
	}

}

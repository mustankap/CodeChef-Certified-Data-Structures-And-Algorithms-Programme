
## Find peak element in 2d Matrix

intuition:
- Here im taking a matrix and doing a binary search on the columns
- Then on the mid column im finding the max element of that column. By doing this we are sure that this element will be the max of that column ie the above element will be lesser and even th below element
- Now we have to check left and right only. _if left is greater that means we have to go towards the left in search of the peak element_ and if _right is greater then we have to to the right side in search of the peak element_.
- *if we find the left element greater than the greatest of the current column then we are sure that in that left column if there is another element which is greater then the left element it will be greater than all the elements in the current column*
![[Screenshot from 2025-04-28 10-03-41.png]]

![[Screenshot from 2025-04-28 10-04-39.png]]

![[Screenshot from 2025-04-28 10-05-10.png]]
```java
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int maxEl = getMaxAtColMid(mid, mat);
            int left = mid - 1 >=0 ? mat[maxEl][mid - 1] : -1;
            int right = mid + 1 < mat[0].length ? mat[maxEl][mid + 1] : -1;

            if (mat[maxEl][mid] > left && mat[maxEl][mid] > right) {
                return new int[] { maxEl, mid };
            } else if (mat[maxEl][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1,-1};
    }

    int getMaxAtColMid(int mid, int[][] mat) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][mid] > max) {
                max = mat[i][mid];
                index = i;
            }
        }
        return index;
    }
}

```

Time complexity: $O(N*logM)$

## Find median in a 2d matrix (Row wise Sorted)

BRUTE FORCE 
![[Screenshot from 2025-04-28 19-34-56.png]]

For this problem we are trying to do a binary search in all the elements in the matrix. 
- Since each row is sorted the smallest number will be the minimum of the first column
- The maximum element will be the maximum of the last column
- so we now have the range min - max
  - now we are doing lower bound to get the max element before $(n*m)/2$  where n is number of rows and m is number of columns
  ![[Screenshot from 2025-04-28 19-33-32.png]]

![[Screenshot from 2025-04-28 19-38-07.png]]
No. of elements <= median



```java
class Solution {
    int median(int mat[][]) {
        // code here
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n = mat.length;
        int m = mat[0].length;
        for(int i =0;i<m;i++)
        {
            low=Math.min(low,mat[i][0]);
            high = Math.max(high,mat[i][n-1]);
        }
        int target = (n*m)/2;
       
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int freqLessThan = noOfElementsLessThan(mat,mid,n,m);
            if(freqLessThan<=target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        
        return low;
    }
    
    int noOfElementsLessThan(int[][] mat,int mid,int n, int m)
    {
        int count =0;
        for(int i =0;i<m;i++)
        {
            count += upperBoundIndex(mat[i],mid,n);
        }
        return count;
    }
    
    
    int upperBoundIndex(int[] arr,int x,int n)
    {
        int low =0;
        int high = n-1;
        int ans = n;
        while(low<=high)
        {
            int middle = low+(high-low)/2;
            if(arr[middle]>x)
            {
                ans = middle;
                high = middle -1;
                
            }
            else{
                low=middle+1;
            }
        }
        
        return ans;
    }
    
}

```
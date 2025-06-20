## Largest Element in an Array
loop through the array and define variable as max
Initially max has the  <mark style="background: #ABF7F7A6;"> minimum value 
</mark>
```java
Integer.min_Value;
```

but as an when you loop through the array we do

```java
Math.max(currrent iteration value, max);
```


## Second Largest Element in an Array without sorting
Keep 2 variables large and second_large
 in the loop the largest will go in the large variable and if we find another variable in the loop which is larger,
 then the previous large element is transferred to second largest and the new element will become the largest
 ```java
int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	return second_large;
```

## Check if the array is sorted
previous element should be smaller than the current element in the entire array
```java
 if (arr[i] < arr[i - 1])
        return false;
```

## Remove duplicates from Sorted array
we will keep to pointers i and j. We will keep increasing the value of j as an when
a[ i ]== a[ j ] . Once we get different values we will increase value of i and replace the value in  a[ i ] with a[ j ]
then all the duplicates will be replaced. we return only till i + 1.

```java
 for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
```
## Left Rotate an array by one place
Shift all right elements one place to the left. temp will have the first element. At the end we will put temp. Hense we have rotated the array

```java
for (int i = 0; i < n - 1; i++) {
    arr[i] = arr[i + 1];
  }
  arr[n - 1] = temp; // assigned the value of variable at the last index
  for (int i = 0; i < n; i++) {
    System.out.print(arr[i]+" ");
```

## Left rotate an array by K places
==**Reversal Algorithm**==
*For Rotating Elements to* right

**Step 1:** Reverse the last k elements of the array
**Step 2:** Reverse the first n-k elements of the array where n is the length
**Step 3:** Reverse the whole array

```java
public static void Rotateeletoright(int[] arr, int n, int k) {
    // Reverse first n-k elements
    Reverse(arr, 0,  k - 1);
    // Reverse last k elements
    Reverse(arr, k, n - 1);
    // Reverse whole array
    Reverse(arr, 0, n - 1);
  }
```


## Move Zeros to end
loop through the array with two pointers i and j
```java
 for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
```

Once got 0 then j+1 will be i 
keep increasing till i is not 0.
once i is 0 and j is non 0 then we swap a[i] and a[j] thus sending the 0 element in a[j] behind
```java
for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
```

## Find the Union

Traverse both the arrays and maintain a two pointer i and j
since both arrays and the union also has to be sorted array without duplicates:
n is the length of the first array
m is the length of the second array

- case 1: arr1[i] == arr2[j] :
  in this case we put only 1 element from either of the two arrays and increment the pointer from where we took the element. Then we will check if the last element in the union array has the same number
  if yes then we can't put that number and increase the pointer.
- case 2: arr1[i] < arr2[j] pick the smaller one and increment its pointer
- case 3: arr1[i] > arr2[j]
```java
ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
  while (i < n && j < m) {
    if (arr1[i] <= arr2[j]) // Case 1 and 2
    {
      if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
        Union.add(arr1[i]);
      i++;
    } else // case 3
    {
      if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
        Union.add(arr2[j]);
      j++;
    }
  }
  while (i < n) // IF any element left in arr1
  {
    if (Union.get(Union.size()-1) != arr1[i])
      Union.add(arr1[i]);
    i++;
  }
  while (j < m) // If any elements left in arr2
  {
    if (Union.get(Union.size()-1) != arr2[j])
      Union.add(arr2[j]);
    j++;
  }
```
## Find missing number in an array
Sum of first N numbers(S1) = (N*(N+1))/2
Sum of all array elements(S2) = i = 0n-2a[i]
The missing number = S1-S2
1. We will first calculate the summation of first N natural numbers(i.e. 1 to N) using the specified formula.
2. Then we will add all the array elements using a loop.
3. Finally, we will consider the difference between the summation of the first N natural numbers and the sum of the array elements.
---
 Property 1. ==> ==XOR of two same numbers is always 0 i.e. a ^ a = 0

 Property 2 ==> ==XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  

Now, let’s XOR all the numbers between 1 to N.  
xor1 = 1^2^.......^N

Let’s XOR all the numbers in the given array.  
xor2 = 1^2^......^N (contains all the numbers except the missing one).

Now, if we again perform XOR between xor1 and xor2, we will get:  
xor1 ^ xor2 = (1^1)^(2^2)^........^(missing Number)^.....^(N^N)  
  
Here all the numbers except the missing number will form a pair and each pair will result in 0 according to the XOR property. The result will be = 0 ^ (missing number) = missing number 
```java
  int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2);
```
## Maximum Consecutive Ones
1. If  the value at the current index is equal to 1 we **increase the value of count by one.** After updating  the count variable if it becomes **more** than the max_count  **update the max_count.**
2. If the value at the current index is equal to zero we make the **variable count as 0** since there are **no more consecutive ones**.
```java
 int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
```

## Find the number that appears once, and other numbers twice.
Use Hashing or hashing using map to get the frequency of the elements in the array
or
Assume the given array is: [4,1,2,1,2]  
XOR of all elements = 4^1^2^1^2  
      = 4 ^ (1^1) ^ (2^2)  
      = 4 ^ 0 ^ 0 = 4^0 = 4  
Hence, 4 is the single element in the array.
```java
int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
```
## Longest subarray with given sum K(positives)

the better option is to use hashing
[<mark style="background: #FFF3A3A6;"> .  .  .  .  . </mark> <mark style="background: #FFB8EBA6;">. </mark><mark style="background: #FFB8EBA6;">  . </mark> .  . ]
 <mark style="background: #FFF3A3A6;">x-k  </mark>       <mark style="background: #FFB8EBA6;">k</mark>
----------  = x
if we are at pink position we will have to reverse engineer and let the sum till pink be x which is greater than k, then at some place before there should exist x-k sum. If it is present that means the subarray has a sum of k.

so everytime we loop through the array we add the elements and add the (sum, index) to the hashmap.
if we get sum == k then we update the length to current index from 0 to i+1

if we got sum more than k we will take it as x.
so we we will check that do we have x-k in the hashmap 
-> if yes; then the subarray with sum k is from <mark style="background: #ABF7F7A6;">that index</mark> in the hashmap to current index.
so ```map.get(sum)``` will give <mark style="background: #ABF7F7A6;">that index </mark> so length of this subarray will be i -  ```map.get(sum)```

If that value is greater than the current length then we update the length else we don't.

second case, if there are zeros in between in the array then it means we have to get the leftmost x-k because we want maximum length of subarray with sum k. so every time the sum is same we have to not update the sum index in the hashmap.

```java

int longestSubArrayWithSumK(List<Integer> a, long k)
{
	Map<long, int> preSumMap = new HashMap<>();
	long sum = 0;
	int maxLen = 0;
	for(int i=0;i<a.size();i++)
	{
		sum+=a[i];
		if(sum==k){
			maxLen = Math.max(maxLen,i+1);
		}
		
		long long rem = sum - k;
		if(preSumMap.containsKey(rem))
		{
			int len = i - preSumMap.get(rem);
			maxLen = Math.max(maxLen,len);
		}

		if(!preSumMap.containsKey(sum)){
			preSumMap.put(sum,i);
		}
	}
return maxLen;
}
```
---
<mark style="background: #BBFABBA6;">TC:</mark> $O(N * log N)$ if ordered Map / TreeMap
$O(N * 1)$ if unordered Map  
the 1 changes in the worst case when there are lot of collisions worst case $O(N * N) = O(N^2)$
<mark style="background: #FFB86CA6;">SC: </mark>  worst case every index will have individual prefix sum so $O(N)$
#### if arrays contains only positives and zeros:
##### Two pointer + greedy:
- Two pointer approach keep increasing j and adding sum.
- if sum crosses value of k then subtract a[i] from the sum and then increase i .
- if it becomes equal to k then update the length.
- update the length only if it is greater then the previous length
```java
		int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
```
## Longest subarray with sum K (Positives + Negatives)

The above solution is the optimal where we used hashmaps.

-----------------------------------------------------------------------------------------------
<mark style="background: #D2B3FFA6;">End of Easy Array Problems</mark>

-----------------------------------------------------------------------------------------------
## Two Sum
1. We will select the element of the array one by one using a loop(say i).
2. Then we will check if the other required element(_i.e._ **_target-arr[i]_**) exists in the hashMap.
    1. If **that element exists**, then we will return “YES” for the first variant or we will return the current index i.e. i, and the index of the element found using map i.e. mp **_[target-arr[i]]._**
    2. If **that element does not exist,** then we will just store the current element in the hashMap along with its index. Because in the future, the current element might be a part of our answer.
3. Finally, if we are out of the loop, that means there is no such pair whose sum is equal to the target. In this case, we will return either “NO” or {-1, -1} as per the variant of the question.

```java
HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(arr[i], i);
        }
        return "NO";
```

**<mark style="background: #BBFABBA6;">Time Complexity:</mark>** $O(N)$, where $N =$ size of the array.  
**Reason:** The loop runs N times in the worst case and searching in a hashmap takes O(1) generally. So the time complexity is O(N).

**Note:** In the worst case(which rarely happens), the unordered_map takes $O(N)$ to find an element. In that case, the time complexity will be $O(N^2)$. If we use map instead of unordered_map, the time complexity will be $(N* logN)$ as the map data structure takes $log N$ time to find an element.

**<mark style="background: #FFB86CA6;">Space Complexity</mark>:** O(N) as we use the map data structure.

**Note:** We have optimized this problem enough. But if in the interview, we are not allowed to use the map data structure, then we should move on to the following approach i.e. two pointer approach. This approach will have the same time complexity as the better approach.

---

optimal using 2 pointer:
At first sort the array.
put one pointer at the start left and one pointer at the end of the array right.
```if(arr[left]+arr[right]==target)```
then return 
if the sum is smaller than the target then left++ ie shift the left pointer ahead to release the smaller value out and get the next little bigger one
else if the sum is greater than target then right -- ie shift the right pointer towards the left to not consider the bigger value and take the smaller value


```Java
Arrays.sort(arr);
int left = 0, right = n - 1;
	while (left < right) {
		int sum = arr[left] + arr[right];
		if (sum == target) {
			return "YES";
		} else if (sum < target) left++;
		else right--;
	}
return "NO";
```

## Sort an array of 0s, 1s and 2s
#### Dutch National Flag problem

let the entire array be separated by pointers low  mid and high

[0 ..... low -1 ] = 0
[low ......... mid-1] = 1
[ mid ......... high] = any unsorted 0/1/2
[high+1  ........... n-1] = 2

[0 ...... | 11111111111.................| ...........         | 2222222222...........]
       low                                 mid      high                                   n-1
if
arr[mid] = 0 => swap(arr[mid],arr[low]) mid++ low++
arr[mid] = 1 => mid++
arr[mid] = 2 => swap(arr[mid],arr[high]) mid++ high --


if mid crosses high then the array is sorted.
Every time the rule is maintained that all numbers below low is 0
all number above high is 2
all numbers from low to mid is 1

```java
int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
```

## Find the majority element that occurs more than N/2 times

Brute force:
$O(N^2)$

```java
Arrays.sort(nums);
return nums[nums.length/2];
```
 $TC = O(nlogn)$
 Better approach is to count freq in hashmap and return the number occuring more than n/2 times

```java
 //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
```
#### Moore’s Voting Algorithm:
- we want to get the element which has the maximum amount in the array which is greater than half n/2.
- for this you keep 2 variables while looping through the array count  and element
	el and cnt
- we take the first element and put it in el and increase the count by 1.
- Next whenever you come across the same number in the array iteration you increase the count by 1. Whatever any other number you find apart from the one in el you decrease the count by 1.
- when increasing and decreasing count if the count becomes 0 that means the number we are keeping track off is not a majority clearly<mark style="background: #FFB8EBA6;"> because the frequency of that number matches with numbers which is not that number</mark>
- so once count becomes 0 we take the next number and make it our new number to keep a track on and that number will go in el.
- At the end whatever element you have in el and still has a count, youll have to verify if it is truly a majority element. For this you will have to traverse in the array and count the number of times it appears in the array. Next we have to see whether that count which we just got from traversing in the array is > n/2 or not. 
- if yes we will return the element 

```java

int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
```

## Maximum Subarray Sum in an Array

#### kandanes algorithm

1. We will run a loop(say i) to iterate the given array.
2. Now, while iterating we will add the elements to the sum variable and consider the maximum one.
3. If at any point the sum becomes negative we will set the sum to 0 as we are not going to consider it as a part of our answer

```java
 long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
```

## Stock buy and sell

keep track of the minimum array element
subtract it from the current value. If that value is the maximum return that.
to get maximum profit value
```java
  int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        minPrice = Math.min(minPrice, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;
```

## Rearrange Array Elements by Sign

Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

brute force will be take 2 lists and loop throught the array; add all positives in pos list and negatives in neg list 
Then create a 3rd array and add from pos and neg alternatively 
```java
for(int i=0;i<n/2;i++){
      A[2*i] = pos.get(i);
      A[2*i+1] = neg.get(i);
  }
```

#### optimal:
```java
   public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();

        // Define array for storing the ans separately.
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (A.get(i) < 0) {
                ans.set(negIndex, A.get(i));
                negIndex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans.set(posIndex, A.get(i));
                posIndex += 2;
            }
        }

        return ans;
```

## Next permutation

#### brute force:
Take out all the permutations and  print the permutation right after it.
Time complexity of <mark style="background: #BBFABBA6;">O(N!xN)</mark>

`next_permutation() `which directly returns the lexicographically next greater permutation of the input in c++.

1. **Find the break-point ,  <mark style="background: #FF5582A6;"> i </mark>
![[next_permutation.png]]
Break-point means the **_first index i from the back of the given array_** where arr[i] becomes smaller than arr[i+1].  
    For example, if the given array is {2,1,5,4,3,0,0}, the break-point will be index 1(_0-based indexing_). Here from the back of the array, index 1 is the first index where arr[1] i.e. 1 is smaller than arr[i+1] i.e. 5.  
    _To find the break-point, using a loop we will traverse the array backward and store the index i where arr[i] is less than the value at index (i+1) i.e. arr[i+1]._

1. **If such a break-point does not exist i.e. if the array is sorted in decreasing order,** the given permutation is the last one in the sorted order of all possible permutations. So, the next permutation must be the first i.e. the permutation in increasing order.  
    So, **_in this case, we will reverse the whole array and will return it as our answer.
    _**

1. **If a break-point exists:**
    1. Find the smallest number i.e. > arr[i] and in the right half of index i(i.e. from index i+1 to n-1) and swap it with arr[i].
    2. Reverse the entire right half(i.e. from index i+1 to n-1) of index i. And finally, return the array.
```java

class Solution {
	
	public void nextPermutation(int[] nums) {
		int ind1=-1;
		int ind2=-1;
		
		// step 1 find breaking point
		for(int i=nums.length-2;i>=0;i--){
			if(nums[i]<nums[i+1]){
				ind1=i;
				break;
			}
		}
		
		// if there is no breaking point
		
		if(ind1==-1){
			reverse(nums,0);
		}
		
		else{
		
			// step 2 find next greater element and swap with ind2
			for(int i=nums.length-1;i>=0;i--){
				if(nums[i]>nums[ind1]){
					ind2=i;
					break;
				
				}
		
			}
		
			  
			
		swap(nums,ind1,ind2);
			
			// step 3 reverse the rest right half
			
		reverse(nums,ind1+1);
			
		}
		
	}


	void swap(int[] nums,int i,int j){
		
		int temp=nums[i];
		
		nums[i]=nums[j];
		
		nums[j]=temp;
	
	}
	
	void reverse(int[] nums,int start){
		
		int i=start;
		
		int j=nums.length-1;
		
		while(i<j){
		
			swap(nums,i,j);
			
			i++;
			
			j--;
		}

	}

}
```

## Leader in the array
all elements to the right of the element should be less than this number so to return all such leaders.
- since we have to make sure all the elements to the right are smaller than the given element lets start our loop from the right itself.
- next, we will check if that element is the max element or greater than the max element till now while looping from the right: 
   --  if yes we will add it to the arraylist
   -- at the end the arraylist will have all the max elements which we got but from the back
   so reverse the arraylist and return it

```java
static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i =n-1;i>=0;i--)
        {
            
            if(arr[i]>=max)
               { max=arr[i];
                ans.add(arr[i]);}
        }
        
        Collections.reverse(ans);
        return ans;
```
## Longest Consecutive Sequence in an Array

You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements.

brute force
for every element do a brute force if element +1 exists in the array and maintain count.
return the maximum count


First, we will put all the array elements into the set data structure.
If a number, `num`, is a starting number, ideally, `num-1 `should not exist. So, for every element, $x$, in the set, we will check if $x-1$ exists inside the set. :
If x-1 exists: This means x cannot be a starting number and we will move on to the next element in the set.

If x-1 does not exist: This means x is a starting number of a sequence. So, for number, x, we will start finding the consecutive elements.

How to search for consecutive elements for a number, x:

Instead of using linear search, we will use the set data structure itself to search for the elements x+1, x+2, x+3, and so on.
Thus, using this method we can narrow down the search and optimize the approach.

Algorithm:
We will declare 2 variables, 

‘cnt’ → (to store the length of the current sequence), 
‘longest’ → (to store the maximum length).

First, we will put all the array elements into the set data structure.
For every element, x, that can be a starting number(i.e. x-1 does not exist in the set) we will do the following:
We will set the length of the current sequence(cnt) to 1.
Then, again using the set, we will search for the consecutive elements such as x+1, x+2, and so on, and find the maximum possible length of the current sequence. This length will be stored in the variable ‘cnt’.
After that, we will compare ‘cnt’ and ‘longest’ and update the variable ‘longest’ with the maximum value (i.e. longest = max(longest, cnt)).
Finally, we will have the answer i.e. ‘longest’.

## Set Matrix Zero
in this we have to make its row and column of the array zero if there exists a zero at a particular position

### brute
## 3sum



## 4sum
```java
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);
                        k++;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;

                        if (k < l && (long) nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            l--;
                            while (k < l && nums[l] == nums[l + 1])
                                l--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
```

## find all pairs in array such that arr[i] > 2* arr[j]



## Max product subarray

|[Count number of subarrays with given xor K](https://takeuforward.org/data-structure/count-the-number-of-subarrays-with-given-xor-k/)|[](https://takeuforward.org/data-structure/count-the-number-of-subarrays-with-given-xor-k/)||[<br><br>](https://www.interviewbit.com/problems/subarray-with-given-xor/)||Hard||
||[Merge Overlapping Subintervals](https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/)|[](https://takeuforward.org/data-structure/merge-overlapping-sub-intervals/)||[<br><br>](https://leetcode.com/problems/merge-intervals/)||Medium||
||[Merge two sorted arrays without extra space](https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/)|[](https://takeuforward.org/data-structure/merge-two-sorted-arrays-without-extra-space/)||[<br><br>](https://leetcode.com/problems/merge-sorted-array/)||Medium||
||[Find the repeating and missing number](https://takeuforward.org/data-structure/find-the-repeating-and-missing-numbers/)|[](https://takeuforward.org/data-structure/find-the-repeating-and-missing-numbers/)||[](https://bit.ly/3zWZoCs)||Hard||
||[Count Inversions](https://takeuforward.org/data-structure/count-inversions-in-an-array/)|[](https://takeuforward.org/data-structure/count-inversions-in-an-array/)||[](https://bit.ly/3PtLWLM)||Hard||
||[Reverse Pairs](https://takeuforward.org/data-structure/count-reverse-pairs/)|[](https://takeuforward.org/data-structure/count-reverse-pairs/)||[<br><br>](https://leetcode.com/problems/reverse-pairs/)||Hard||
||[Maximum Product Subarray](https://takeuforward.org/data-structure/maximum-product-subarray-in-an-array/)|[](https://takeuforward.org/data-structure/maximum-product-subarray-in-an-array/)||[<br><br>](https://leetcode.com/problems/maximum-product-subarray/)

get the median of two sorted arrays:

```java




import java.util.*;

public class tUf {
    public static double median(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        //if n1 is bigger swap the arrays:
        if (n1 > n2) return median(b, a);

        int n = n1 + n2; //total length
        int left = (n1 + n2 + 1) / 2; //length of left half
        //apply binary search:
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            //calculate l1, l2, r1 and r2;
            int l1 = (mid1 > 0) ? a[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; //dummy statement
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 7, 10, 12};
        int[] b = {2, 3, 6, 15};
        System.out.println("The median of two sorted arrays is " + median(a, b));
    }
}



```
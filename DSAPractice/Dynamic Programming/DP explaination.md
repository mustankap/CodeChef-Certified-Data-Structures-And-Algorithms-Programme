## code format

```c++

f(ind , [])
{

	if(ind > = n) //basecase
		print([])
		return;

	[].add(arr[i]);
	
	f(ind+1,[]) //takes
	[].remove(arr[i]);
	
	f(ind+1,[])  //doesn take
}
```


recursion for finding subsequence

1) 
2)f(0,[])

pick
f(i+1,[])
remove
arr.remove()

do not pick

f(i+1,[])

2) print any 1
if condition satisfies return true 
if condition does not satisfy then return false 

3) sum/ count
out here if condition satisfies return 1
if condition does not satisfy return 0 
and the end of the function do left + right

	when ever you have to find all the ways of doing things remember to do recursion
	recursion always works from n-1 to 0 that is from behind

	 1) first think of indexes
	 2) do all the stuff with those index to make a recursion backwards
	 3) remove max min and base conditions

for changing into
#### memoization
you have to first draw the  recurrsion tree and find out oerlapping subproblems then 
have to build an array dp[n] and fill it with -1

now you can add a statement 
```java
if(dp[index]==-1) return dp[n]

//and afterwards in the end calls just return dp[n] = f()+f()

```

For   
#### Tabulation 
do the bottom up technique where you start from the base cases and put it in the first part of the array and loop and add using the recursion relation

#### space optimization
use the . . . . . . techniques and define variables to traverse on these dots

##### sample DP exercise
1) [x] edit distance between two strings
###### Recursion

```java
f(i,j,s1,s2)
{
	if(i<0) return j+1;
	if(j<0) return i+1;
	if(s1[i]==s2[j]) return f(i-1,j-1,s1,s2);
	return 1+min(f(i-1,j-1,s1,s2),min(f(i-1,j,s1,s2),f(i,j-1,s1,s2)));
 }

edit(String s1, String s2)
{
int n = s1.length();
int m = s2.length();
return f(n-1,m-1,s1,s2);
}
```

###### memoization

```c++
f(int i,int j,String &s1, String &s2, vector<int> &dp)
{
	if(i<0) return j+1;
	if(j<0) return i+1;
	if(dp[i][j]!=-1) return dp[i][j];

	if(s1[i]==s2[j]) return dp[i][j]=f(i-1,j-1,s1,s2);
	return dp[i][j]=1+min(f(i-1,j-1,s1,s2),min(f(i-1,j,s1,s2),f(i,j-1,s1,s2)));
 }

edit(String s1, String s2)
{
	int n = s1.length();
	int m = s2.length();
	vector<int> dp(n, vector<int>(m,-1));
	return f(n-1,m-1,s1,s2,dp);
}
}```

###### Tabulation

```c++

edit(String s1, String s2)
{
	int n = s1.length();
	int m = s2.length();
	vector<int> dp(n+1, vector<int>(m+1,0));

	for(int i=0;i<n;i++)
		dp[i][0]=i;
	for(int j=0;j<m;j++)
		dp[0][j]=j;

	for(int i=1;i<n;i++)
	{	
		for(int j=1;j<m;j++)
		{
			if(s1[i-1]==s2[j-1]) 
				dp[i][j]=dp[i-1][j-1];
			else 
				dp[i][j]=1+min(dp[i-1][j-1],min(dp[i-1][j],dp[i][j-1]));
		}
	}
	return dp[n][m];
}
```

###### Space optimization

```c++
edit(String s1, String s2)
{
	int n = s1.length();
	int m = s2.length();
	vector<int> prev(n+1,0) , cur(m+1,0);


	for(int j=0;j<m;j++)
		dp[0][j]=j;

	for(int i=1;i<n;i++)
	{	cur[0] = i;
		for(int j=1;j<m;j++)
		{
			if(s1[i-1]==s2[j-1]) 
				curr[j]=prev[j-1];
			else 
				cur[j]=1+min(prev[j-1],min(prev[j],cur[j-1]));
		}
		prev = cur;
	}
	
	return prev[m];
}
```
2) [x] Compute the  maximum length of a common  subarray of two arrays
3) [ ] maximizing scheduling problem
4) [ ] coins in a line
---
###### from the slides
1) [x] fibonnacci
2) [x] Binomial coefficients
3) [x] Floyds method
4) [x] shortest path
5) [ ] matrix chain multiplication
6) [ ] optimal binary search tree
7) [ ] number of paths
8) [ ] kahns algorithm

----
### Ninjas Training

```java
f(day,last)
{
	if(ind == 0)
	{
		maxi = 0;
		for(i = 0 -> 2)
			if(i!=last)
				maxi = max(maxi,task[0][i]);
		return maxi;
	}

	for(i = 0->2 )
	{
		if(i!=last)
			points = task[day][i] + f(day-1,i);
			maxi = max(maxi,points);
	}
	return maxi;
}
```

[[Drawing 2024-05-02 13.20.00.excalidraw]]


```java
 static int f(int day, int last, int[][] points, int[][] dp) {
        // If the result is already calculated, return it
        if (dp[day][last] != -1) return dp[day][last];

        // Base case: When it's the first day (day == 0)
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last)
                    maxi = Math.max(maxi, points[0][i]);
            }
            return dp[day][last] = maxi; // Store and return the result
        }

        int maxi = 0;
        // Loop through the three activities on the current day
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                // Calculate the points for the current activity and recursively
                // calculate the maximum points for the previous day
                int activity = points[day][i] + f(day - 1, i, points, dp);
                maxi = Math.max(maxi, activity); // Update the maximum points
            }
        }

        return dp[day][last] = maxi; // Store and return the result
    }

    // Function to find the maximum points for ninja training
    static int ninjaTraining(int n, int[][] points) {
        // Initialize a memoization table with -1 values
        int dp[][] = new int[n][4];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        // Start the recursive calculation from the last day (n - 1) with the last activity (3)
        return f(n - 1, 3, points, dp);
    }
```


#### Tabulation

```java
static int ninjaTraining(int n, int[][] points) {
        // Initialize a 2D array 'dp' to store the maximum points
        int[][] dp = new int[n][4];
        
        // Initialize the first day's maximum points based on the available choices
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        // Iterate through each day and each activity
        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0; // Initialize the maximum points for the current day and last activity
                // Consider each possible task for the current day
                for (int task = 0; task <= 2; task++) {
                    if (task != last) { // Ensure that the current task is different from the last
                        // Calculate the points for the current activity and add it to the maximum points from the previous day
                        int activity = points[day][task] + dp[day - 1][task];
                        // Update the maximum points for the current day and last activity
                        dp[day][last] = Math.max(dp[day][last], activity);
                    }
                }
            }
        }

        // Return the maximum points achievable after all days (last activity is 3)
        return dp[n - 1][3];
    }
```


### Divide and Conquer

1) [ ] subarray with maximum sum
2) [ ] output the position of q in this matrix
3) [ ] value of x where f (x) = 0
4) [ ] sorted array of distinct non-negative integers, find the smallest integer that does not appear in this array
5) [ ] median of two equally-sized sorted arrays
---
#### slides
1) [x] Quicksort
2) [x] mergesort
3) [ ] STRASSEN’S MATRIX MULTIPLICATION
4) [ ] LARGE INTEGER MULTIPLICATION
5) [ ] array of n integers, find max and min of array simultaneously
6) [ ] white black
7) [ ] find peak
8) [ ] number of inversions

---
### Greedy Method


1) [ ] coin change
2) [x] knapsack
3) [x] 0/1 knapsack
4) [ ] task scheduling
5) [ ] text compression and huffman
6) [x] kruskal
7) [x] prim
8) [x] djikstra
9) [ ] row theatre
10) [ ] bulb switchnig
11) [ ] gas petrol distance
12) [ ] segments by points


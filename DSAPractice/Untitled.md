```
A segment of positive integers [l,r] is called coprime if l and r are coprime.

A coprime segment [l,r] is called minimal coprime if it does not contain any coprime segment not equal to itself. 
Given [l,r], a segment of positive integers, find the number of minimal coprime segments contained in [l,r].

Two integers a and b are coprime if they share only one positive common divisor. For example, the numbers 2 and 4 are not coprime because they are both divided by 2 and 1, but the numbers 7 and 9 are coprime because their only positive common divisor is 1.

A segment [l′,r′] is contained in the segment [l,r] if and only if l≤l′≤r′≤r .

Input

Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤100). The description of the test cases follows.

The only line of each test case consists of two integers ll and rr (1≤l≤r≤10^9).

Output

For each test case, output the number of minimal coprime segments contained in [l,r], on a separate line.

Example

Input

6

1 2

1 10

49 49

69 420

1 1

9982 44353

Output

1
9
0
351
1
34371

Note

On the first test case, the given segment is [1,2]. The segments contained in [1,2] are as follows.

- [1,1]: This segment is coprime, since the numbers 1 and 1 are coprime, and this segment does not contain any other segment inside. Thus, [1,1] is minimal coprime.
- [1,2]: This segment is coprime. However, as it contains [1,1], which is also coprime, [1,2] is not minimal coprime.
- [2,2]: This segment is not coprime because 2 and 2 share 2 positive common divisors: 1 and 2.

Therefore, the segment [1,2] contains 1 minimal coprime segment.
```
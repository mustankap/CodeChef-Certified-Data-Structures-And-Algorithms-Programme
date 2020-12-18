package testJava;

import java.util.Scanner;

public class septlunchrobo2020 {
/*
 * import sys
import math as m


def uno(): return int(sys.stdin.readline().strip())


def dos(): return sys.stdin.readline().strip()


def tres(): return map(int, sys.stdin.readline().strip().split())


def cuatro(): return sys.stdin.readline().strip().split()


def dfs(tr, v, vis, ct):
    vis[v] = 0
    for i in tr[v]:
        if vis[i] == 1:
            ct = dfs(tr, i, vis, ct)
    ct -= 1
    return ct


for _ in range(uno()):
    n = uno()
    tr = [[] for i in range(n+1)]
    vis = [1]*(n+1)
    vis[0] = 0
    c = 500000
    for i in range(n-1):
        u, v = tres()
        tr[u].append(v)
    for i in range(1, n+1):
        vis = [1]*(n+1)
        vis[0] = 0
        ct = dfs(tr, i, vis, n)
        c = min(ct, c)
    print(c)
 */
	
	
	
	public static int dfs(int tr[][],int v,int[] vis, int ct)
	{ vis[v] = 0;
	    for(int i:tr[v])
	        if (vis[i] == 1)
	            ct = dfs(tr, i, vis, ct);
	    ct -= 1;
	    return ct;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int vis[]= new int[n];
			int tr[][]=new int[n][n];
			
				for(int j =0;j<n;j++)
				{
					vis[j]=1;
				}
				
				int c = 500000;
			
			vis[0] = 0;
			for(int i =0;i<n;i++)
			{
				
			}
		}
	}

}

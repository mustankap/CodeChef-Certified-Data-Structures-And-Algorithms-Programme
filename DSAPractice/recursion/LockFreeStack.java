
/**
 * 
2 testcase
2 no of threads
2(no of elements in the list) 1 2 (the list)
2(no of elements in the list) 3 4 (the list)
4 3 2 1 (the pop order)

since it is last in first out the stack looks like this

|4|
|3|
|2|
|1|
___

2
2 1 2
2 3 4
1 2 3 4

*/

/**
import java.util.*;
import java.lang.*;
import java.io.*;

// Name of the class has to be "Main" only if the class is public. 
class LockFreeStack
{
	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	static String next() throws IOException {

		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}
		return st.nextToken();
	}

	static BufferedReader br;
	static StringTokenizer st;
	static BufferedWriter bw ;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t=nextInt();
		while(t-->0) {
			lock_free_stack();
		}
		bw.close();
	}
	
	public static void lock_free_stack()throws IOException {
		int n=nextInt();
		Stack<Integer>[]s=new Stack[n];
		int c=0;
		for(int i=0;i<n;i++) {
			s[i]=new Stack<>();
			int x=nextInt();
			c+=x;
			int[]a=new int[x];
			for(int j=0;j<x;j++) {
				a[j]=nextInt();
			}
			for(int j=x-1;j>=0;j--) {
				s[i].push(a[j]);
			}
		}
		int[]arr=new int[c];
		for(int i=0;i<c;i++) {
			arr[i]=nextInt();
		}
		if(n==1) {
			Stack<Integer> a=s[0];
			boolean b=true;
			for(int i=c-1;i>=0;i--) {
				if(arr[i]==a.peek()) {
					a.pop();
				}else {
					b=false;
					break;
				}
			}
			
			if(b) {
				bw.append("Yes"+"\n");
			}else {
				bw.append("No"+"\n");
			}
			return;
		}
		if(lock_free_recur(s, arr, c)) {
			bw.append("Yes"+"\n");
		}else {
			bw.append("No"+"\n");
		}
	}

	public static boolean lock_free_recur(Stack<Integer>[]s,int[]arr,int n) {
		if(n==0) {
			return true;
		}
		int x=arr[n-1];
		for(Stack<Integer> st:s) {
			if(!st.isEmpty() && st.peek()==x) {
				int v=st.pop();
				if(lock_free_recur(s, arr, n-1)) {
					return true;
				}
				st.push(v);
			}
		}
		return false;
	}
}


*/

import java.io.*;
import java.util.*;

class LockFreeStack {

    static BufferedReader br;
    static StringTokenizer st;

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int t = nextInt();
        while (t-- > 0) {
           input();
        }

        br.close();
    }

    public static void input()throws IOException
    {
         // no of threads
         int n = nextInt(), c = 0;
         // the huge stack
         Stack<Integer> s[] = new Stack[n];
         for (int i = 0; i < n; i++) {
             // stack inside huge stack
             s[i] = new Stack<>();
             // length of the values
             int len = nextInt();
             // array for adding in small stack
             int a[] = new int[len];
             for (int j = 0; j < len; j++) {
                 a[j] = nextInt();
             }
             c += len;
             for (int k = len - 1; k >= 0; k--) {
                 s[i].push(a[k]);
             }
         }

         int arr[] = new int[c];
         for (int i = 0; i < c; i++) {
             arr[i] = nextInt();
         }
         int z =c-1;boolean flag=false;
         if (n == 1) {
             Stack<Integer> st = s[0];
             while(!st.isEmpty() || z>=0)
             {
                if(st.peek()==arr[z])
                    {st.pop(); flag=true;}
                else 
                {
                    flag=false;
                    break;
                }
                z--;
             }
             if(flag==true){
             System.out.println("Yes");return;}
             else{
             System.out.println("No");return;
             }

            //  Stack<Integer> a = s[0];
            //  boolean b = true;
            //  for (int i = c - 1; i >= 0; i--) {
            //      if (arr[i] == a.peek()) {
            //          a.pop();
            //      } else {
            //          b = false;
            //          break;
            //      }
            //  }

            //  if (b) {
            //      System.out.println("Yes");
            //  } else {
            //      System.out.println("No");
            //  }
            //  return;
         }

         if (loc_recur(s, arr, c)) {
             System.out.println("Yes");
         } else {
             System.out.println("No");
         }
    }
    public static boolean loc_recur(Stack<Integer> s[], int[] arr, int n) {
        if (n == 0)
        {return true;}

        int x = arr[n - 1];
        for (Stack<Integer> st : s) {
            if (!st.isEmpty() && st.peek() == x) {
                int v = st.pop();
                if (loc_recur(s, arr, n - 1)) {
                    return true;
                }
                st.push(v);
            }
        }

        return false;

    }
}

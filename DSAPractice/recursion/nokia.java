
import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class nokia
{
    public static int max(int n) {
        return (((n + 1) * (n + 2)) / 2) - 1;
    }
    
    public static int min(int start, int end) {
        int c = 0;
        if (end - start != 1) {
            int mid = start + (end - start) / 2;
            c = end - start;
            c += min(start, mid);
            c += min(mid, end);
        }
        return c;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		while (tc-- != 0) {
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    int minSum = min(0, n + 1);
		    int maxSum = max(n);
		    
		    if (minSum > m) {
		        System.out.println("-1");
		    }
		    else if (maxSum < m) {
		        System.out.println(m - maxSum);
		    }
		    else {
		        System.out.println("0");
		    }
		}

        sc.close();
	}
}

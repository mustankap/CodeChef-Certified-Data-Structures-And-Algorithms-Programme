import java.util.*;

//https://www.codechef.com/problems/INTEST
// Remember that the class name should be "Main" and should be "public".
public class Enormous_Input_Test_INTEST {
	public static void main(String[] args) 
	{
	    try{
	        
	    
		// System.in and System.out are input and output streams, respectively.
	Scanner sc = new Scanner(System.in);

	

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if (x % k == 0) {
				ans++;
			}
		}

		System.out.println(ans);
	} catch(Exception e)
	{
	    return;
	}
	}

	
}

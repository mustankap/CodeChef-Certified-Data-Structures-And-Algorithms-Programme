import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */

public class reverseno {

    /* package codechef; // don't place package name! */


	public static void main (String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test cases:");
		int t = sc .nextInt(),i;String no;
		while(t--!=0)
		{   System.out.println("Enter the number to reverse:");
		    no=sc.next();
		    String m="";
		    for(i=no.length()-1;i>=0;i--)
		    {
		        m+=no.charAt(i);
		        
            }

            int number=Integer.parseInt(m);
        
            System.out.println(number);
            
        
		    
		}
	}
}



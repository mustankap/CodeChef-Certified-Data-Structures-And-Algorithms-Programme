// Java program to print minimum number that can be formed
// from a given sequence of Is and Ds
import java.util.*;
class minimumNumberFromGivenSequence
{

	

	
	//,Prints,the,minimum,number,that,can be formed from
	// input sequence of I's and D's
	static String PrintMinNumberForPattern(String s)
	{
		Stack<Integer> ans= new Stack<>();
        String res="";
        for(int i=0;i<=s.length();i++)
        {
            ans.push(i+1);
            
            if(i==s.length() || s.charAt(i)=='I')
            {
                while(!ans.isEmpty())
                {res+=String.valueOf(ans.peek());
                ans.pop();}
            
            }
            
            
        }
        return res;
	}

	// Driver code
	public static void main(String[] args)
	{
		System.out.println(PrintMinNumberForPattern("IDID"));
		System.out.println(PrintMinNumberForPattern("I"));
		System.out.println(PrintMinNumberForPattern("DD"));
		System.out.println(PrintMinNumberForPattern("II"));
		System.out.println(PrintMinNumberForPattern("DIDI"));
		System.out.println(PrintMinNumberForPattern("IIDDD"));
		System.out.println(PrintMinNumberForPattern("DDIDDIID"));
	}
}

// This code is contributed by Princi Singh

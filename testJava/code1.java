package newjava;

import java.util.*;
import java.util.regex.*;

public class code1
{
	private String firstName;
	private String lastName;
	private int id;
	
	
	public code1(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	


	@Override
	public String toString() {
		return "code1 [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}

	
	


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]=new int[50];
		
		/*for(int p:a)
		{System.out.println(p);
		}*/
		
		System.out.println(argu(1,2,3,4,5));
		Date d =new Date();
		System.out.println(d.getDate());
		System.out.println(d.getYear()+1900);
		
		
		
		Pattern pat = Pattern.compile("M.");
		Matcher mat = pat.matcher("Mustansir");
		boolean result=mat.matches();
		System.out.println(result);
		
		boolean result1=Pattern.compile("F....n").matcher("Farhan").matches();
		System.out.println(result1);
		}
	
	
	public static int argu(int...numba)
	{	int rsum=0;
	  		
			for(int sum:numba)
	  		{
	  			rsum=rsum+sum;
	  		}
	  			return(rsum);
	}
	
	
	
	
}





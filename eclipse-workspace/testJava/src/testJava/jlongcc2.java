package testJava;

import java.util.*;

public class jlongcc2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the no of test cases:");
		int t = sc.nextInt(),i,j;
		while(t-->0)
		{ int pair=0;
			String line=sc.next();
		
			for(i=0;i<line.length()-1;i++)
			{
				
					if(line.charAt(i)=='x'&& line.charAt(i+1)=='y')
					{
						pair++;
						i+=1;
					}
					else if(line.charAt(i)=='y'&& line.charAt(i+1)=='x')
					{
						pair++;
						i+=1;
					}
			}
			
			
			System.out.println(pair);
		
		}

	}

}

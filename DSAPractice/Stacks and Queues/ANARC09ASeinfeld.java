
/**
import java.util.Scanner;

public class ANARC09ASeinfeld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int d=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{')
				d++;
			else if(s.charAt(i)=='}')
				d--;
		}
		
	}

}**/
import java.util.*;
import java.io.*;
public class ANARC09ASeinfeld
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int zz=1;
		String s;
		while(((s=sc.next()).charAt(0))!='-')
		{
	   
			int op=0,open=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='{'){
					open++;
				}
				else if (open>0){
					open--;
				}
				else{
					open++;
					op++;
				}
			}
			op+=open/2;
			System.out.println((zz++)+". "+op);
    
		}

 
  }
}

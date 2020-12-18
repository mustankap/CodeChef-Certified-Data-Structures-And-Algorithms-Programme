package testJava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class SonarSystems {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("hello world");
		int n=Integer.parseInt(reader.readLine());
		String s =reader.readLine();
		String[] s1=s.split(" ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(s1[i]);
			
		}
		
		for(long soo: a)
		{
			System.out.println(soo);
			
		}
		
		*/
		
		Date d=new Date();
		System.out.println(d.toString());
		System.out.println(d.getTime());
		System.out.println(d.getYear());
		
		
		
	}

}

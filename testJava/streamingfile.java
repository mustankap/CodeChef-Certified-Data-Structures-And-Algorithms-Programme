package testJava;
import java.io.*;
class streamingfile
{
	public static void main(String[] args)throws IOException
	{
		/*FileInputStream input=null;
		input=new FileInputStream("fileinput.txt");
		
		int number;
		while((number=input.read())!=-1)
		{
			System.out.println(number);
		}
	*/
		
		InputStreamReader in =new InputStreamReader(System.in);
		System.out.println("Enter characters,e for exit");
		char ch;
		do
		{
			ch=(char)in.read();
			System.out.println(ch);
		}while(ch!='e');
		
		if(in!=null)
		{
			in.close();
		}
		}
}

package testJava;
class myException extends Exception{
	  String str1;
		public myException(String str2)
		{
			str1=str2;
			 
		}

		public String toString()
		{
			return ("myException was triggered: "+str1);
		}
	}
public class dip {

	

	public static void main(String[] args) {
		try
		{
			throw new myException("This is the custom error message");
			
		}
		catch(myException error)
		{
			System.out.println(error);
		}

	}

}

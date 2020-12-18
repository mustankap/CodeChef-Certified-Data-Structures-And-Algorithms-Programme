

import java.util.*;



class test
{
	public static void main (String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int h1,h;
		Queue<Integer> q = new LinkedList<>();
	 
		while(true)
		{  
			h=sc.nextInt();
	   		q.add(h);
			
			   if(q.peek()==42)
			   {break;}
		
	
			
	    	h1=q.remove();
	    	System.out.println(h1);
		}
		
	}
	 
}
	



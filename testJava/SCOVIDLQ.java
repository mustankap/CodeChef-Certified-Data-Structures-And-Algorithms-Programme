import java.util.*;

public class SCOVIDLQ 
{
	public static void main(String[] args) 
    {
	    try
        {
	        Scanner sc = new Scanner(System.in);
	        
            int t =sc.nextInt(),i;
            Stack<Integer> stack= new Stack<Integer>();
            while(t--!=0)
            {  
                int n =sc.nextInt();
                int a[]=new int[n];
                
                for(i=0;i<n;i++)
                {
                    a[i]=sc.nextInt();
                }
                
                
                for(i=0;i<n;i++)
                {
                    if(a[i]==1)
                    { 
                    stack.push(i);
                    }
                }

                int flag=0;
                int ao;
            
                while(!stack.isEmpty())
                {
                    ao =stack.pop();
                    if(!stack.isEmpty())
                    {if((ao-stack.peek())<6)
                    {
                        System.out.println("NO");flag =1; break;
                    }}
                }
        
                if(flag==0)
                {
                    System.out.println("Yes");
                }

                                           
            } 
		 
	    }catch(Exception e)
            {
              return;
	        }

	}
}


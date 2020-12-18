import java.util.*;
public class COVIDLQ 
    {
        public static void main(String[] args) 
        {
            try 
            {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("no of test cases:");
	            int t =sc.nextInt(),i;
                    while(t--!=0)
	                {
                        int n =sc.nextInt();
                        int a[]=new int[n];              
	                    int c=0,flag=0,j;
                            for(i=0;i<n;i++)
                            a[i]=sc.nextInt();

                        for(i=0;i<n-1;i++)
                        {
                            if(a[i]==1)
                            {  
                                j=i+1;
                                while(a[j]==0)
                                {
                                    c++;j++;
                                    if(j>n&&a[j-1]==0)break;
                                }
                                
                                if(c<5&&a[j]==1)
                                    {System.out.println("NO");flag=5;break;}
                            } c=0;
                        }
                        
                        if(flag==0)
                        {System.out.println("YES");}

                    }
                
	        }catch(Exception e) {return;}

        }
    }
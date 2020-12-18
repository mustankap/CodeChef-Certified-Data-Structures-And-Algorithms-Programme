import java.util.*;
public class Main
{
    public static void main(String args[])
    {  int i, t =0;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of test cases:")
    int t = sc.nextInt();
        while(t--)
        { 
            
            
            System.out.println("enter the no of submissions:");
            int n =sc.nextInt();
            
            int no = new int[n];
            int so = new int[n];
            
            for(i=0;i<n;i++)
            {
              System.out.println("The first no. tells the number of the submission and the second its score:");
              int n1 =sc.nextInt();int s =sc.nextInt();
              no[i]=n1;so[i]=s;
            }
            
             
             
            for(i=0;i<n;i++)
            {
                for(x=i+1;x<n;x++)
                {
                    if(no[i]>no[x])
                    {
                    c=no[i];
                    no[i]=no[x];
                    no[x]=c;
                     c=so[i];
                    so[i]=so[x];
                    so[x]=c;
                    }
                
                }
            }
            
               
                int m=0;
            
           
                while(no[m]==no[m+1])
                {
                 jip[m]=so[m];
                 m++;
                }
                  
              
            
            max = jip[0];
        for(int i = 0; i < jip.length; i++)
        {  if(no[i]!=9&&no[i]!=10&&no[i]!=11)
         {
            if(max < jip[i])
            {
                max = jip[i];
            }
         }
        }
            total=total+max;
        }
        
    }
}
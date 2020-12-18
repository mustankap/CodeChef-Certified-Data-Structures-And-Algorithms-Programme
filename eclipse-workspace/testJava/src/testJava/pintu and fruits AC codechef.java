import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
    try
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    int t =sc.nextInt();
        while(t--!=0)
        {
            int n =sc.nextInt();
            int m =sc.nextInt();
            int i,j,sum1=0;
            int f[]=new int[n];  
            int p[]=new int[n];  
            int c=0,d=0;
            
            for(i=0;i<n;i++)f[i]=sc.nextInt();
            for(i=0;i<n;i++)p[i]=sc.nextInt();
            
            int sum=0;
            i=0;j=0;sum=Integer.MAX_VALUE;
            //int q[]=new int[n];
            for(i=0;i<n;i++)
            {   j=0;
            sum1=0;
                while(j<n)
                {
                    if(f[i]==f[j])
                    {
                        sum1+=p[j];
                       
                    }
                j++;
                   
                }if(sum1<sum)
                {
                    sum=sum1;
                }
            }
            System.out.println(sum);
        }
        }catch(Exception e){return;}
    }
}
  
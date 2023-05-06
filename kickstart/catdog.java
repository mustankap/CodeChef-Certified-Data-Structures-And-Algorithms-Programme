/*Round G 2021 - Kick Start 2021*/
import java.util.*;
import java.io.*;

class catdog{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        
        long d,c;
        for(int t =1;t<=T;t++)
        { int n,m,i=0,cflag=0;
            String[] s=br.readLine().split(" ");
            n=Integer.parseInt(s[0]);
            d=Long.parseLong(s[1]);
            c=Long.parseLong(s[2]);
            m=Integer.parseInt(s[3]);
            
            String chd=br.readLine();
            char[] cd = chd.toCharArray();

            for(i = 0;i<=n-1;i++)
            {
               if(cd[i]=='D')
               {
                if(c<0 || d<=0)
                {
                    
                    cflag = 1;
                   
                    break;
                }
                d-=1;
                c+=m;
                   
               }
               else{
                   
                  c--;
                   
                }
            }
           
        
           if(cflag == 1)
            {
               System.out.println("Case #"+t+": "+"NO");
            }else{
                   System.out.println("Case #"+t+": "+"YES");
               }
               
                
        }
    }
}
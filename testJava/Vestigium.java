import java.util.*;

class Vestigium
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the no of test cases:");
            int t = sc.nextInt();
            while(t--!=0)
            {   System.out.println("enter the degree n:");
                int n = sc.nextInt();
                int mat[][]=new int[n][n];int i,x;
                for(i=0;i<n;i++)
                {
                    for(x=0;x<n;x++)
                    {
                        mat[i][x]=sc.nextInt();

                    }
                }
                int trace =0;
                for(i=0;i<n;i++)
                {
                    for(x=0;x<n;x++)
                    {
                        if(i==x)
                        {
                            trace+=mat[i][x];
                        }
                    }
                }
                int m1,m2,a,rcount=0,c,r,ccount=0;

               for(i=0;i<n;i++)
                {
                    for(x=0;x<n;x++)
                    {   a=mat[i][x];
                        
                       //rows
                       
                       
                           
                        m2=x+1;
                       for(c=m2;m2<n;m2++)
                       { if(a==mat[i][c])
                          {rcount++;break outer;}
                       }
                       
                    }

                    outer:
                

                }

                
                for(i=0;i<n;i++)
                {
                    for(x=0;x<n;x++)
                    { 
                       //columns
                       m1=i+1;
                       for(r=m1;r<n;r++)
                       {  if(a==mat[r][x])
                          {ccount++;break outer1;}
                       }

                    
                    }
                    outer1:
                }

                System.out.println("case #"+(t+1)+": "+trace+" "+rcount+" "+ccount);
            }
        }
    }


            

        

    


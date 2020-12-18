package testJava;
import java.util.*;
public class jlongcc3
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
    	 int n= sc.nextInt(),flag=1;
    	 int g,a[]=new int[n];
    	 for(int i=0;i<n;i++)
    	 {
    		g=sc.nextInt();
    		
    		if(i==0&&g==5)
    			{a[i]=g;continue;}
    		else if(i==0&&(g==10||g==15))
    				{flag=0;break;}
    		
    		
    		int c=g-5;
    		 if(c==0)
    		 	a[i]=g;
    		 else if(c==5)
    		   { int dd=a.length;
    			 boolean result = search(a,c,dd);
    			 if(result==true)
    			 {
    				 a[i]=g;
    			 }
    			 else
    			 {
    				 flag=0;break;
    			 }
    			 
    		   }
    		    else if(c==10)
    		         {int dr=a.length,p=0,koi=0,m=0;
    		          for (int i1 = 0; i1 < dr; i1++) { 
 	             
 	                   if (a[i1] == c) 
 	                      {a[i1]=0;a[i]=g;koi=1;break;}
 	                       else if(a[i1]==5)
 	            	            {p++;
 	            	            	if(p==1)
 	            	            	{m=i1;}
 	            	            
 	            	            if(p==2)
 	            	            {a[i1]=0;a[m]=0;a[i]=g;koi=1;break;}
 	                            
 	            	            continue;}
    		          }
 	                       
 	                      if(koi!=1)
 	                    	  flag=0;
 	                       
 	            
 	                }
    		 }
    		
    		
    	 	
    	 
    	 if(flag==0)
    	 {
    		 System.out.println("NO");
    	 }
    	 else
    	 {
    		 System.out.println("YES");
    	 }
		}  
     }
	
	
	public static boolean search(int a[],int c,int alen) {
		  for (int i = 0; i < alen; i++) { 
	            // Return the index of the element if the element 
	            // is found 
	            if (a[i] == c) 
	                {a[i]=0; return true;}
	            
	            
	        } 
	  
	        // return -1 if the element is not found 
	        return false; 
	    } 
		
	}
	
	



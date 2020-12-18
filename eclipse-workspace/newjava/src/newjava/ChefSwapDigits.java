
import java.util.*;
public class ChefSwapDigits
{
	public static void main(String[] args) {
	    try {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the amount of test cases:");
	        int t =sc.nextInt();int i,c,j,z,z1,c1,c2;
                while(t--!=0)
	        {   System.out.println("enter the first no:");
	            String a =sc.nextLine();
	            System.out.println("enter the second no:");
	            String b =sc.nextLine();
                int ar[]=new int[a.length()];
                c=0;
                int br[]=new int[b.length()];
	            int v=0;
	            int ans[]=new int[100];
		 for(i=0;i<a.length();i++)ar[i]=a.charAt(i)-'0';
         for(i=0;i<b.length();i++)br[i]=b.charAt(i)-'0';
         
         
         for(i=0;i<ar.length;i++)
         {
             for(j=0;j<br.length;j++)
             {   
                 swap(ar[i],br[j]);
                z= convtarrtoint(ar);
                 z1= convtarrtoint(br);
                v=c1+c2;
                ans[c]=v;
                 c++;
             }
         }
         
         Arrays.sort(ans);
         System.out.println(ans[ans.length-1]);
	            
	        }
	    } catch(Exception e) {return;
	    }
	     public static int convtarrtoint(int ap[])
	     {
	        int len=ap.length;int no=0,ib;
	        for(ib=0;ib<len;ib++)
	        no= Math.pow(10,len-ib)*ap[ib]+no;
	        return no;
	     }
	     public static void swap(int ui,int ux)
	     {
	         int temp=0;
	         temp=ui;
	         ui=ux;
	         ux=temp;
	     }
	    
	    

	}


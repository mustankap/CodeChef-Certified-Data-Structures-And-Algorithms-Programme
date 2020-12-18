package testJava;
import java.util.*;
 class morecake
 {
 
   public static double sumOfGP(int members, int kidSlices, int r)
   {
    if(r == 1)
        return members*kidSlices;
    double ans =(kidSlices*(Math.pow(r, members)-1))/(r-1);
    return ans;
    }
 
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    double extra = 0, shortBy = 0;
    for(int i = 0; i < t; i++) {
        int slices;int members, kidSlices, r;
        
       slices=sc.nextInt();
       members=sc.nextInt();
       kidSlices=sc.nextInt();
       r=sc.nextInt();
       double reqiuredAtLeast = sumOfGP(members, kidSlices, r);
        
        if(slices >= reqiuredAtLeast) {
            double remaining = slices - reqiuredAtLeast;
           System.out.println("POSSIBLE "+(int)remaining);
            extra += remaining;
        }
        else {
           double required = reqiuredAtLeast - slices;
           System.out.println("IMPOSSIBLE "+(int)required);
            shortBy += required;
        }
    }
    if(extra >= shortBy)
         System.out.println("POSSIBLE");
    else 
        System.out.println("IMPOSSIBLE");
   }
}
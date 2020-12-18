package testJava;
import java.util.*;
public class RPGProtagonist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		 
        while (t-- != 0) {
 
            long p = scn.nextLong(), f = scn.nextLong(), cnts = scn.nextLong(), cntw = scn.nextLong();
            long s = scn.nextLong(), w = scn.nextLong();
 
            long ans = 0;
            
            if(w<s){
                long temp = cnts;
                cnts = cntw;
                cntw = temp;
                
                temp = s;
                s = w;
                w = temp;
            }
 
            for (int i = 0; i <= cnts && i * s <= p; i++) {
 
                long ds = Math.min((cnts - i), f / s);
 
                long mrs = p - (i * s);
                long drs = f - ds * s;
 
                long tx = Math.min(cntw, mrs / w + drs / w);
 
                ans = Math.max(ans, tx + i + ds);
            }
 
            System.out.println(ans);
        }
	}

}

package testJava;
import java.math.*;
import java.util.*;
public class manysquares
{
	

	public static void main(String[] args)throws Exception
	{ BigInteger MOD = new BigInteger("1000000007");
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {

	        long M = sc.nextLong();
	        long N = sc.nextLong();
	        
	        BigInteger n1, n2, n3, n4, n5, n6, m, ans;
	        
	        n1 = new BigInteger("" + Math.min(M, N));
	        m = new BigInteger("" + Math.max(M, N));
	        
	        n2 = n1.modPow(new BigInteger("2"), MOD);
	        n3 = n1.modPow(new BigInteger("3"), MOD);
	        n4 = n1.modPow(new BigInteger("4"), MOD);
	        n5 = n1.modPow(new BigInteger("5"), MOD);
	        n6 = n1.modPow(new BigInteger("6"), MOD);
	        
	        //(−4N^6+6N^5M−18N^5+30N^4M−25N^4+60N^3M+60N^2M+29N^2+24NM+18N)/180
	        n6 = n6.multiply(new BigInteger("-4"));
	        //6N^5M-18n^5
	        n5 = (n5.multiply(m.multiply(new BigInteger("6")))).add(n5.multiply(new BigInteger("-18")));
	        //30n^4m−25N^4
	        n4 = (n4.multiply(m.multiply(new BigInteger("30")))).add(n4.multiply(new BigInteger("-25")));
	        //60N^3M
	        n3 = (n3.multiply(m.multiply(new BigInteger("60"))));
	        //60N^2M+29N^2
	        n2 = (n2.multiply(m.multiply(new BigInteger("60")))).add(n2.multiply(new BigInteger("29")));
	        //24NM+18N
	        n1 = (n1.multiply(m.multiply(new BigInteger("24")))).add(n1.multiply(new BigInteger("18")));
	        
	        
	        ans = n1.add(n2.add(n3.add(n4.add(n5.add(n6)))));
	        ans = ans.mod(MOD);
	        ans = ans.multiply(new BigInteger("205555557"));
	        ans = ans.mod(MOD);
	
	        System.out.println(ans);

	                }
	        }
	}


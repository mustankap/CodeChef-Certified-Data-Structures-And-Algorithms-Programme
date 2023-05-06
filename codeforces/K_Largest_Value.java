import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class K_Largest_Value {
//https://codeforces.com/contest/1491/problem/A
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        String[] st=br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int q = Integer.parseInt(st[1]);
        String[] aa =br.readLine().split(" ");
        ArrayList<Integer> al = new ArrayList<>();
        for(String e : aa)
        {
            al.add(Integer.parseInt(e));
        }
        
        while(q-->0)
        {   
            String[] st2=br.readLine().split(" ");
            if(Integer.parseInt(st[0])%2==0)
            {   int k = Integer.parseInt(st[1]);
                Collections.sort(al, Collections.reverseOrder());
                System.out.println(al.get(k));
            }
            else{
                int x = Integer.parseInt(st[1]);
                al.set(x,1-al.get(x));
                System.out.println(al.get(x));
            }
        }
	}
}
        
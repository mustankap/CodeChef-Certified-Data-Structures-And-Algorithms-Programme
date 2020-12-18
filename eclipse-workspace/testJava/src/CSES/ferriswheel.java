package CSES;
import java.io.*;
import java.util.*;
public class ferriswheel {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st[] = br.readLine().split(" ");
		int n=Integer.parseInt(st[0]);
		int x=Integer.parseInt(st[1]);
		
		st = br.readLine().split(" ");
		ArrayList<Integer> p = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            p.add(Integer.parseInt(st[i]));
        }  
        Collections.sort(p);
        int i = 0;
        int j = n - 1;
        int c = 0;
        while (i <= j) {
          if (p.get(j) + p.get(i) > x) j--;
          else { i++; j--; }
          c++;
        }
        System.out.println(c);
         
        

	}
}

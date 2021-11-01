/**
 * @author mustansir
 *  given n
 *  array of n coordinates
 *  find minimum area of rectangle around k points
 * 
 */
import java.util.*;
import java.io.*;

public class min_area
{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		System.out.println(Arrays.toString(s));

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
		for(int i = 0; i < s.length/2; i++)
		{
		    for(int j = 0; j <= 1; j++)
		    {
                if(j==0) 
                    maxX = Math.max(Integer.parseInt(s[j+2*i]),maxX);
                if(j==1) 
                    maxY = Math.max(Integer.parseInt(s[j+2*i]),maxY);
                if(j==0) 
                    minX = Math.min(Integer.parseInt(s[j+2*i]),minX);
                if(j==1) 
                    minY = Math.min(Integer.parseInt(s[j+2*i]),minY);
		    }
		}
		
		int len = maxX - minX + 2;
		int h   = maxY - minY + 2;
		System.out.println(len * h);
		
		
		
	}
}

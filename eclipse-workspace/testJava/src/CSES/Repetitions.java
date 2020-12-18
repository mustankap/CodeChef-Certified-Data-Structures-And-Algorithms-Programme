package CSES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Repetitions {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int count = 1, best=Integer.MIN_VALUE,flag=0;
        for (int i = 0; i < st.length()-1; i++)
        {
            if (st.charAt(i)== st.charAt(i+1))
            {
               
               count++;
            }
            else {
            	if(best<count)
            		best=count;
            	
            	count=1;
            }
        }
            best = Math.max(best, count);
            
        
        
        
        	System.out.println(best);
        
	}

}


//https://leetcode.com/contest/weekly-contest-276/problems/minimum-moves-to-reach-target-score/

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class noToTarget
{
	public static void main(String[] args) {
		System.out.println(minMoves(19,2));
	}
	
	

   public static int minMoves(int target, int maxDoubles) {
        int i =1,count =0;
        if(maxDoubles==0)
        {
           
            return i+target-1;
        }
        while(i<target && maxDoubles>0)
        {
            i*=2;count++;
            maxDoubles--;
            
        }
        if(i==target)
            return count;
        
        if(i>target)
        {
            i=i/2; count--;
            while(i<target)
            {
                i++;count++;
            }
        }
        
        
        
        return count;
    }

}

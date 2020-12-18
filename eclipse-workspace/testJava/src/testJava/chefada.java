package testJava;
import java.util.*;

public class chefada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			char pp[][]=new char[8][8];
			
			int k = sc.nextInt(),i,j;
			//initial defining
			for(i=0;i<8;i++)
			{
				for(j=0;j<8;j++)
				{
					pp[i][j]='x';
				}
			}
			
			pp[0][0]='o';
			
			int m=0;
			for(int y =0;y<8;y++)
			{
				for(int y1 =0;y1<8;y1++)
				{   if(y==0&&y1==0)
					{
					continue;
					}
					if(k>=2)
					{pp[y][y1]='.';k--;}
				
				
				
				}
				
			}
			
			
			//printing
			for(i=0;i<8;i++)
			{
				for(j=0;j<8;j++)
				{
			  System.out.print(pp[i][j]);
				}
				System.out.println();
			}
		}
		
	}

}

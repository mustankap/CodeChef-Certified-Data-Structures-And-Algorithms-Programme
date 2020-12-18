package testJava;

import java.util.Scanner;

public class HeidiLearnsHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long r=sc.nextLong();
		long y =(r-3)/2;
		if(r%2==1&&y>0)
		{
			System.out.println(1+" "+y);
		}
		else
		{
			System.out.println("NO");
		}
	}

}

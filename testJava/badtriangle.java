
/**
 *
 * 
 * 
 * 
 * 0 1  2  3  4  5  6 
 * 3 4 5 4 6 11 11 15 18 20
 * 
 * 
 * 6+11< 18
 * 
 * 
 * 
 * 
 * #include<bits/stdc++.h>
using namespace std;
#define f(n) for(int i=0;i<n;i++)
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		vector<int> v(n,0);
		f(n) cin>>v[i];
		
		
		if(v[0]+v[1]<=v[n-1]) cout<<1<<" "<<2<<" "<<n<<endl;
		else cout<<-1<<endl;
	}
}
 */
import java.util.Scanner;

public class badtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[]= new int[n];
			int i;
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			if(a[0]+a[1]<=a[n-1]) 
				System.out.println(1+" "+2+" "+n);
			else 
				System.out.println(-1);
		}

	}

}

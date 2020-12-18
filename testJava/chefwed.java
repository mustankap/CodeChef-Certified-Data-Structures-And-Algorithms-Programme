package testJava;
/**
 * #include <bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    long long int t;
    cin>>t;
    
    while(t--){
    
        long long int n,k;
        cin>>n>>k;
        int ui =n;
        long long int arr[n+1];
        
        for(long long int i=0;i<n;i++){
            cin>>arr[i];
        }
        ui=n+k;
        
        map<long long int, long long int>fmap;
        
        
        long long int fans=0, temp=0, test=1;
        
        
        long long int rr[n+1][n+1] ={0};
        
        for(long long int i=0;i<n;i++){
            for(long long int j=0;j<n;j++){
                rr[i][j] =0;
                ui++;
            }
        }
        
        
        for(long long int i=0;i<n;i++)
        {
            fmap.clear();
            
            for(long long int j=i;j<n;j++){
            
                if(j==0){
                    rr[i][j] = 0;
                    ui--;
                }
                else{
                    rr[i][j] =rr[i][j-1];
                }
                
                if(fmap.count(rr[j])){
                    
                    if(fmap[rr[j]]==1){
                        rr[i][j]++;
                    }
                    rr[i][j]++;
                }
                fmap[arr[j]]++;
            }
        }
        
        
        fans = 1e18;
        long long int ftable= 100;
        long long int fdp[101][10001] = {0};
        for(long long int i=0;i<=ftable; i++){
            for(long long int j=0;j<=ftable; j++){
                fdp[i][j] = 0;
                ui++;
            }
        }
        for(long long int i=0;i<n+1;i++){
            fdp[1][i] = darr[0][i-1];
        }
        for(long long int i=2;i<= ftable;i++){
            fdp[i][1] =0;
        }
        for(long long int i=2; i<= ftable;i++){
            for(long long int j=2;j<=n;j++){
                long long int fbest=1e18;
                for(long long int p=1;p<j;p++){
                    fbest= min(fbest,fdp[i-1][p]+rr[p][j-1]);
                }
                fdp[i][j] = fbest;
            }
        }
        for(ftable=1; ftable<=100; ftable++){
            fans= min(ftable*k+fdp[ftable][n],fans);
        }
        cout<< fans <<"\n";
    }
    return 0;
}
 */
import java.util.HashMap;
import java.util.Scanner;

public class chefwed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k = sc.nextInt();
			int a[]=new int[n+1];
			HashMap<Integer,Integer> mp = new HashMap<>();
			int ans=0,vc=0,t1=1;
			
			for(int i =0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			int col[][]=new int[n+1][n+1];
			
			
			for(int i=0;i<n;i++)
	        {
	            mp.clear();
	            
	            for(int j=i;j<n;j++){
	            
	                if(j==0){
	                    col[i][j] = 0;
	                }
	                else{
	                    col[i][j] = col[i][j-1];
	                }
	                
	                if(mp.containsKey(a[j])){
	                    
	                    if(mp.containsValue(a[j])==1){
	                        col[i][j]++;
	                    }
	                    darr[i][j]++;
	                }
	                fmap[arr[j]]++;
	            }
	        }
			
			
		}
	}

}

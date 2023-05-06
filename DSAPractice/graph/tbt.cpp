
#include <bits/stdc++.h>
using namespace std;
int main(){
  ios::sync_with_stdio(false);
  cin.tie(0);cout.tie(0);

  int t;
  cin>>t;

  while(t--){
    int n;
    cin>>n;

    string s[3*n+1];
    map<string,int>mp;

    for(int i=0;i<3*n;i++){
        cin>>s[i];
        mp[s[i]]++;
    }

    int c=0;
    for(int i=0;i<3*n;i++){

        if(mp[s[i]]==1) c+=3;
        if(mp[s[i]]==2) c+=1;
        
        if(i%n==n-1)
        {
            cout<<c<<" ";c=0;
        }
    }
    cout<<endl;
  }
 
}
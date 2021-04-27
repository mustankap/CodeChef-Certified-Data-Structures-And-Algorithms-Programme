#include <bits/stdc++.h>
#define ll long long
#define pb emplace_back
#define fr first
#define sc second
#define endl "\n"
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll t;
    cin >> t;
    while(t--){
        ll a, b;
        cin >> a >> b;
        string s;
        cin >> s;
        if(count(s.begin() , s.end() , '0') == s.size()){
            cout << "0" << endl;
            continue;
        }
        int m = 0  , d = -1 , i = 0 , c , n = s.size();
        while( i < n ){
            c = 0;
            int st = i;

            while(s[i%n] == '0'){
                c++;
                i++;
            }
            if(c > m){
                m = c;
                d = st;
            }
            i++;
        }
        
        ll ans = a;
        c = 0;
        if(m == 0){
            cout << ans << endl;
            continue;
        }
        c= 0;
        for(int i = m + d; (i)%n != d;i++){
            if(s[i%n]=='0'){
                c++;
            } else {
                ans = ans + min(c*b , a);
                c = 0;
            }
        }
        
        cout << ans << endl;
    }
    return 0;
}

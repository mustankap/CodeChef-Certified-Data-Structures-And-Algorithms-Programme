#include<bits/stdc++.h>

using namespace std;

#define FAST() ios_base::sync_with_stdio(false);cin.tie(NULL)


int main()
{
    FAST();
    string s;
    long long a,b,i,l,t,ans;
    cin >> t;
    while(t--)
    {
        cin >> a >> b >> s;
        l=(int)s.size();
        vector<int>v;
        for(i=0; i<l; i++)
        {
            if(s[i] == '0')
            {
                if(i == 0  ||  s[i-1] == '1')
                {
                    v.emplace_back(0);
                }
                ++v.back();
            }
        }
        if((int)v.size() == 1  &&  v[0] == l)
        {
            cout << "0\n";
            continue;
        }
        
        ans=a;
        if(!v.empty())
        {
            if(s[0] == '0'  &&  s[l-1] == '0')
            {
                l=v.back();
                v.pop_back();

                if(v.empty())
                {
                    v.emplace_back(l);
                }
                else 
                {
                    v[0]+=l;
                }
            }

            sort(v.begin(),v.end());
            v.pop_back();

            l=(int)v.size();
            for(i=0; i<l; i++)
            {
                ans+=min(b*v[i],a);
            }
        }
        cout << ans << '\n';
    }
    return 0;
}
#include <bits/stdc++.h>
using namespace std;
const long nPrime = 998244353;
int main() {
    int n;
    cin >> n;
    long nOrd = 1;

    vector<long> viAns(n+1,1);

    for(int i = 1; i <= n; i++){
        nOrd *= 2;
        nOrd %= nPrime;
        viAns[i] = nOrd - (1+i+i*(i-1)/2);
        viAns[i] %= nPrime;
    }
    
    vector<pair<int, int>> viixy(n);

    for(int i = 0; i < n; i++){
        cin >> viixy[i].first >> viixy[i].second;
    }

    vector<vector<int>> vviNum(n,vector<int>(n,0));

    vector<int> viCount(n+1, 0);
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            if(i == j){
                continue;
            }
            for(int k = 0; k < n; k++){
                if(  (viixy[i].first - viixy[j].first) * (viixy[j].second - viixy[k].second)
                  == (viixy[j].first - viixy[k].first) * (viixy[i].second - viixy[j].second)){
                    vviNum[i][j]++;
                }
            }
            viCount[vviNum[i][j]]++;
        }
    }
    
    long nAns = viAns[n];
    for(int i = 3; i <= n; i++){
        viCount[i] /= (i*(i-1));
        nAns -= viAns[i] * viCount[i];
        nAns %= nPrime;
    }
    nAns += nPrime;
    nAns %= nPrime;
    cout << nAns << endl;
}
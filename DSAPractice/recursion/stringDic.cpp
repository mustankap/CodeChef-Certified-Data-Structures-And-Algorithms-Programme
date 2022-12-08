#include<bits/stdc++.h>
using namespace std;

void recusrion(int l, string s, set<string> &dic, vector<string> &temp) {
    cout<<"ind:"<<l<<endl;
    if(l == s.size()) {
        for(auto &s : temp)
            cout<<s<<" ";
        cout<<endl;
    }

    for(int i = l; i < s.size(); i++) {
        string first = s.substr(l, i - l + 1);
        cout<<"i:"<<i<<endl;
        cout<<"l:"<<l<<endl;

        cout<<"first:"<<first<<endl;
        if(dic.find(first) != dic.end()) {
            cout<<"present in dictionary"<<endl;
            temp.push_back(first);
            cout<<"temp:"<<first<<endl;
            recusrion(i+1, s, dic, temp);
            
            temp.pop_back(); 
            cout<<"temp:"<<first<<endl;  
        }cout<<"not present in dictionary :("<<endl;
    }

}

int main() {
    string input = "godisnowherenowhere";
    set<string> dic = {"god", "is", "no", "now", "where", "here"};
    vector<string> temp;
    recusrion(0, input, dic, temp);
}
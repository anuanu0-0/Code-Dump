#include <bits/stdc++.h>
using namespace std;

void solve(string s)
{
    vector<char> chars;
    unordered_map<char, int> freqMap;
    for (int i = 2; i < s.size(); i++) {
        if ((i + 1) % 3 == 0) chars.push_back(s[i]);
        freqMap[s[i]]++;
    }

    int n = chars.size()-1;
    for(int i=0; i<=n; i++) {
        if(i==0) {
            cout << "[" << chars[i];
        } else if(i==n) {
            cout  << ", "<< chars[i] << "]" << endl;
        } else {
            cout << ", " << chars[i];
        }
    }

    char max_rec;
    int max_count = INT_MIN;
    for(auto x : freqMap) {
        if(x.second > max_count) {
            max_count = x.second;
            max_rec = x.first;
        }
    }

    cout << "Maximum recurring character: " << max_rec << endl;
}

int main()
{
    string s;
    cin >> s;
    solve(s);
    return 0;
}
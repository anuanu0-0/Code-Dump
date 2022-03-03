#include <bits/stdc++.h>
using namespace std;

void solve()
{
    int n;
    cin >> n;
    int num_ele = n;
    int arr[26] = {0};
    while (n--) {
        string s;
        cin >> s;
        set<char> st(s.begin(), s.end());
        for (char val : st)
            arr[val - 'a']++;
    }
    int count = 0;
    for (int i = 0; i < 26; i++) {
        if (arr[i] == num_ele)
            count++;
    }
    cout << count << endl;
}

int main()
{
    solve();
    return 0;
}
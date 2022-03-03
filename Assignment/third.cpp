#include <bits/stdc++.h>
using namespace std;

void solve(int n) {
    int numSq = 0;
    while(n>0) {
        n-=(int)sqrt(n) * (int)sqrt(n);
        numSq++;
    }

    cout << numSq << endl;
}

int main()
{
    int n;
    cin >> n;
    solve(n);
    return 0;
}
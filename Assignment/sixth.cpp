#include <bits/stdc++.h>
using namespace std;

void solve(int arr[], int n) {
    
    int maxEnding = arr[0], res = arr[0];
    for (int i = 1; i < n; i++) {
        maxEnding = max(maxEnding + arr[i], arr[i]);
        res = max(res, maxEnding);
    }
    cout << res << endl;
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    solve(arr, n);
    return 0;
}
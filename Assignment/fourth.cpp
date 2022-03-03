#include <bits/stdc++.h>
using namespace std;

void solve(int n, int* arr, int k) {
    int minEle = *min_element(arr, arr+n);
    int maxEle = *max_element(arr, arr+n);

    int minMoves = 0;
    if(maxEle == minEle) {
        cout << minMoves << endl;
        return;
    }

    int rem = maxEle % k;
    for(int i=0; i<n; i++) {
        if(arr[i] % k != rem) {
            cout << -1 << endl;
            return;
        } 
    }

    int count = 0;
    for(int i=0; i<n; i++) {
        count += (maxEle - arr[i])/k;
    }
    cout << count << endl;
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    for(int i=0; i<n; i++) cin>>arr[i];

    int k; cin>>k;
    solve(n, arr, k);
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

void solve(int n, int* arr, int k) {
    int minEle = *min_element(arr, arr+n);
    int maxEle = *max_element(arr, arr+n);

    int tmax = maxEle, tmin = minEle, freq = 1;
    while(tmax > tmin*freq) {
        tmin = minEle;
        tmin*=freq++;
    }


    int minMoves = 0;
    if(maxEle == minEle) {
        cout << minMoves << endl;
    } else if(){
        
    }
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
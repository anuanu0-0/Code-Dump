#include <bits/stdc++.h>
using namespace std;

void solve(int arr[], int l, int h) {
   
    if (l > h) return;

    if (l == h) {
        cout << arr[l] << endl;
        return;
    }

    int m = (l + h) / 2;

    if (m % 2 == 0) {
        if (arr[m] == arr[m + 1]) solve(arr, m + 2, h);
        else solve(arr, l, m);
    } 
    else {
        if (arr[m] == arr[m - 1]) solve(arr, m + 1, h);
        else solve(arr, l, m - 1);
    }
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    solve(arr, 0, n - 1);
    return 0;
}
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    
    vector<int> v;
    
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        v.push_back(a);
    }
    
    sort(v.begin(), v.end());
    
    int x;
    cin >> x;
    
    int cnt = 0;
    int l = 0;
    int r = n - 1;
    while (l < r) {
        int mid = v[l] + v[r];
        if (mid == x) {
            cnt++;
            l++;
            r--;
        } else if (mid < x) {
            l++;
        } else if (mid > x) {
            r--;
        }
    }
    
    cout << cnt;
    return 0;
}
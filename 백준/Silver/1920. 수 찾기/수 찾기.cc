#include <iostream>
#include <algorithm>

using namespace std;

bool check(int* arr, int N, int b);

int main() {
    
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    
    int N;
    cin >> N;
    int* arr = new int[N];
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }
    
    sort(arr, arr + N);
    
    int M;
    cin >> M;
    
    for (int i = 0; i < M; i++) {
        int b;
        cin >> b;
        if (check(arr, N, b)) {
            cout << 1 << "\n";
        } else {
            cout << 0 << "\n";
        }
    }
    
    return 0;
}

bool check(int* arr, int N, int x) {
    int l = 0;
    int r = N - 1;
    
    while (l <= r) {
        int mid = l + (r - l) / 2;
        int mValue = arr[mid];
        
        if (x < mValue) {
            r = mid - 1;
        } else if (x > mValue) {
            l = mid + 1;
        } else {
            return true;
        }
    }
    return false;
}
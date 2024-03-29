#include <iostream>

using namespace std;

int main() {
    
    int N, M;
    cin >> N >> M;
    
    int arr[N+1];
    
    for (int i = 1; i <= N; i++) {
        arr[i] = i;
    }
    
    for (int i = 0; i < M; i++) {
        int a, b;
        cin >> a >> b;
        for (int j = a; j <= (b - a) / 2 + a; j++) {
            swap(arr[j], arr[b + a - j]);
        }
    }
    
    for (int i = 1; i <= N; i++) {
        cout << arr[i] << " ";
    }
    
    return 0;
}
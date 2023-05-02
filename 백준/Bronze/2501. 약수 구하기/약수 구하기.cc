#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N, K;
    vector<int> v;
    
    cin >> N >> K;
    
    for (int i = 1; i <= N; i++) {
        if (N % i == 0) {
            v.push_back(i);
        }
    }
    
    int l = v.size();
    if (K > l) {
        cout << 0;
    } else {
        cout << v[K - 1];
    }
}
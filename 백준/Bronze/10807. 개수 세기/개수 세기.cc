#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N, a;
    int cnt = 0;
    cin >> N;
    vector<int> vec(N);
    
    for (int i = 0; i < N; i++) {
        cin >> vec[i];
    }
    
    cin >> a;
    for (int b : vec) {
        if (b == a) {
            cnt++;
        }
    }
    cout << cnt;
    return 0;
}
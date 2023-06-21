#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    
    int sum = 0;
    int near = 0;
    
    vector<int> a(N);
    for (int i = 0; i < N; i++) {
        cin >> a[i];
    }
    
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            for (int k = j + 1; k < N; k++) {
                sum = a[i] + a[j] + a[k];
                if (near < sum && sum <= M) {
                    near = sum;
                }
            }
        }
    }
    
    cout << near << endl;
    
    return 0;
}

#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> T;
    vector<int> P;
    int* dp = new int[N+1];
    
    int t, p;
    
    for (int i = 0; i < N; i++) {
        cin >> t >> p;
        T.push_back(t);
        P.push_back(p);
    }
    
    for (int i = 0; i < N; i++) {
        if (i + T[i] <= N) {
            dp[i + T[i]] = max(dp[i + T[i]], dp[i] + P[i]);
        }
        dp[i+1] = max(dp[i+1], dp[i]);
    }
    cout << dp[N];
    return 0;
}
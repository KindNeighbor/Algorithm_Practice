#include <iostream>
#include <climits>

using namespace std;

int main() {
    int N, r[501], c[501];
    int dp[501][501];
    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> r[i] >> c[i];
    }
    
    for (int a = 1; a < N; a++) {
        for (int i = 0; i < N - a; i++) {
            int j = i + a;
            dp[i][j] = INT_MAX;
            for (int k = i; k < j; k++) {
                dp[i][j] = min(dp[i][j], dp[i][k] + dp[k+1][j] 
                               + r[i] * r[k+1] * c[j]);
            }
        }
    }
    cout << dp[0][N-1];
}
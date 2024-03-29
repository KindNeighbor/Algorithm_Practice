#include <iostream>

using namespace std;

int main() {
    int n, k;
    
    cin >> n >> k;
    
    int coin[n];
    int dp[10001];
    
    for (int i = 0; i < n; i++) {
        cin >> coin[i];
    }
    
    for (int i = 1; i <= k; i++) {
        dp[i] = 10001;
    }
    
    for (int i = 0; i < n; i++) {
        for (int j = coin[i]; j <= k; j++) {
            dp[j] = min(dp[j], dp[j - coin[i]] + 1);
        }
    }
    
    if (dp[k] == 10001) cout << -1 << '\n';
    else cout << dp[k] << '\n';
    
    return 0;
}
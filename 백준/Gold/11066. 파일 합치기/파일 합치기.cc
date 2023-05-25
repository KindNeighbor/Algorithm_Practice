#include <iostream>
#include <vector>
#include <climits>

using namespace std;

int main() {
    int T;
    cin >> T;

    for (int i = 0; i < T; i++) {
        int K;
        cin >> K;
        vector<int> files(K);
        vector<int> sum(K+1, 0);
        vector<vector<int>> dp(K+1, vector<int>(K+1, 0));

        for (int j = 0; j < K; j++) {
            cin >> files[j];
        }

        for (int j = 1; j <= K; j++) {
            sum[j] = sum[j-1] + files[j-1];
        }

        for (int a = 1; a < K; a++) {
            for (int start = 1; start + a <= K; start++) {
                int end = start + a;
                dp[start][end] = INT_MAX;
                for (int mid = start; mid < end; mid++) {
                    dp[start][end] 
                        = min(dp[start][end], dp[start][mid] + dp[mid+1][end] 
                              + sum[end] - sum[start-1]);
                }
            }
        }

        cout << dp[1][K] << endl;
    }

    return 0;
}
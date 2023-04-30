#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0); 
    
    int N, M;
    cin >> N >> M;
    
    int arrNum;
    int sum[N + 1][N + 1];
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> arrNum;
            sum[i + 1][j + 1] = sum[i + 1][j] + sum[i][j + 1] - sum[i][j] + arrNum;
        }
    }
    
    int x1, y1, x2, y2;
    for (int i = 0; i < M; i++) {
        cin >> x1 >> y1 >> x2 >> y2;
        cout << sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1] << '\n';
    }
    return 0;
}
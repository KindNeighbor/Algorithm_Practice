#include <iostream>
#include <vector>
using namespace std;

int min_val = 64;
vector<vector<bool>> arr;

void sol(int a, int b) {
    int end_A = a + 8;
    int end_B = b + 8;
    int cnt = 0;

    bool BW = arr[a][b];

    for (int i = a; i < end_A; i++) {
        for (int j = b; j < end_B; j++) {
            if (arr[i][j] != BW) {
                cnt++;
            }
            BW = !BW;
        }
        BW = !BW;
    }
    cnt = min(cnt, 64 - cnt);
    min_val = min(min_val, cnt);
}

int main() {
    int N, M;
    cin >> N >> M;
    arr.resize(N, vector<bool>(M, false));

    for (int i = 0; i < N; i++) {
        string s;
        cin >> s;

        for (int j = 0; j < M; j++) {
            if (s[j] == 'W') {
                arr[i][j] = true;
            } else {
                arr[i][j] = false;
            }
        }
    }

    int cut_N = N - 7;
    int cut_M = M - 7;

    for (int i = 0; i < cut_N; i++) {
        for (int j = 0; j < cut_M; j++) {
            sol(i, j);
        }
    }
    cout << min_val << endl;

    return 0;
}
#include <iostream>
#include <cstring>
#include <sstream>

using namespace std;

int main() {
    int T;
    cin >> T;
    int arr[100][100];
    memset(arr, 0, sizeof(arr));

    for (int i = 0; i < T; i++) {
        int a, b;
        cin >> a >> b;
        for (int j = a; j < a+10; j++) {
            for (int k = b; k < b+10; k++) {
                arr[j][k] = 1;
            }
        }
    }

    int cnt = 0;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 100; j++) {
            if (arr[i][j] == 1) {
                cnt++;
            }
        }
    }

    cout << cnt << endl;
    return 0;
}
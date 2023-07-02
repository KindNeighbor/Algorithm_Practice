#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int N;
    cin >> N;
    vector<vector<int>> a(N, vector<int>(2));

    for (int i = 0; i < N; i++) {
        cin >> a[i][0] >> a[i][1];
    }

    sort(a.begin(), a.end());

    for (int i = 0; i < N; i++) {
        cout << a[i][0] << " " << a[i][1] << '\n';
    }

    return 0;
}
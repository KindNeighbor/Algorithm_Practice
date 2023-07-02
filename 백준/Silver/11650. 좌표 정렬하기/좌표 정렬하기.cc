#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(const vector<int>& b1, const vector<int>& b2);

int main() {
    int N;
    cin >> N;
    vector<vector<int>> a(N, vector<int>(2));

    for (int i = 0; i < N; i++) {
        cin >> a[i][0] >> a[i][1];
    }

    sort(a.begin(), a.end(), compare);

    for (int i = 0; i < N; i++) {
        cout << a[i][0] << " " << a[i][1] << '\n';
    }

    return 0;
}

bool compare(const vector<int>& b1, const vector<int>& b2) {
    if (b1[0] == b2[0]) {
        return b1[1] < b2[1];
    } else {
        return b1[0] < b2[0];
    }
}
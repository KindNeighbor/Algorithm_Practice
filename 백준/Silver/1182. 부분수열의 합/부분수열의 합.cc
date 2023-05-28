#include <iostream>
#include <vector>

using namespace std;

int N, S;
vector<int> v;
int cnt = 0;

void back(int idx, int a) {
    if (idx == N) return;
    if (a + v[idx] == S) cnt++;
    
    back(idx + 1, a);
    back(idx + 1, a + v[idx]);
}

int main() {
    cin >> N >> S;
    for (int i = 0; i < N; i++) {
        int a;
        cin >> a;
        v.push_back(a);
    }
    
    back(0, 0);
    cout << cnt;
    return 0;
}
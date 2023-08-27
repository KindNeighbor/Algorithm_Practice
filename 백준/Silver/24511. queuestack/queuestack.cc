#include <iostream>
#include <deque>
#include <vector>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;
    cin >> N;

    vector<int> type(N);
    deque<int> dq;

    for (int i = 0; i < N; i++) {
        cin >> type[i];
    }

    for (int i = 0; i < N; i++) {
        int a;
        cin >> a;
        if (type[i] == 0) {
            dq.push_back(a);
        }
    }

    int M;
    cin >> M;

    for (int i = 0; i < M; i++) {
        int c;
        cin >> c;
        dq.push_front(c);
        int b = dq.back();
        dq.pop_back();
        cout << b << " ";
    }

    return 0;
}
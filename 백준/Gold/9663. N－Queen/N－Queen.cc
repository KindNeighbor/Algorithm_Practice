#include <iostream>
#include <vector>

using namespace std;

int N = 0;
int cnt = 0;
vector<int> v;

int nQueen(int row);
bool check(int row);

int main() {
    cin >> N;
    v.resize(N);
    cout << nQueen(0);
}

int nQueen(int row) {
    if (row == N) {
        cnt++;
        return cnt;
    }
    
    for (int i = 0; i < N; i++) {        
        v[row] = i;
        if (check(row)) {
            nQueen(row+1);
        }
    }
    return cnt;
}

bool check(int row) {
    for (int i = 0; i < row; i++) {
        if (v[row] == v[i] || row - i == abs(v[row] - v[i])) {
            return false;
        }
    }
    return true;
}
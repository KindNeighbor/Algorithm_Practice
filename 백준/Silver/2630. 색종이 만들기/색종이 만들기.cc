#include <iostream>
#include <vector>

using namespace std;

int white = 0;
int blue = 0;
vector<vector<int>> v;

void sol(int row, int col, int size);
bool colorCheck(int row, int col, int size);

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;
    cin >> N;
    
    v.resize(N, vector<int>(N));
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> v[i][j];
        }
    }
    
    sol(0, 0, N);
    
    cout << white << '\n';
    cout << blue << '\n';
    
    return 0;
}

void sol(int row, int col, int size) {
    if (colorCheck(row, col, size)) {
        if (v[row][col] == 0) white++;
        else blue++;
        return;
    }
    
    int newSize = size / 2;
    sol(row, col, newSize);
    sol(row + newSize, col, newSize);
    sol(row, col + newSize, newSize);
    sol(row + newSize, col + newSize, newSize);
}

bool colorCheck(int row, int col, int size) {
    int color = v[row][col];
    
    for (int i = row; i < row + size; i++) {
        for (int j = col; j < col + size; j++) {
            if (color != v[i][j]) {
                return false;
            }
        }
    }
    return true;
}
#include <iostream>
#include <queue>
#include <cstring>

using namespace std;

bool check[1001];
int arr[1001][1001];
int N, M, V;
string s;

void dfs(int x);
void bfs(int x);

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    
    cin >> N >> M >> V;
    memset(arr, 0, sizeof(arr));
    memset(check, false, sizeof(check));
    
    for (int i = 0; i < M; i++) {
        int u, v;
        cin >> u >> v;
        arr[u][v] = 1;
        arr[v][u] = 1;
    }
    
    dfs(V);
    s += "\n";
    memset(check, false, sizeof(check));
    bfs(V);
    cout << s << "\n";
}

void dfs(int x) {
    check[x] = true;
    s += to_string(x) + " ";
    
    for (int i = 1; i <= N; i++) {
        if (arr[x][i] == 1 && !check[i]) {
            dfs(i);
        }
    }
}

void bfs(int x) {
    queue<int> q;
    q.push(x);
    check[x] = true;
    
    while (!q.empty()) {
        x = q.front();
        q.pop();
        s += to_string(x) + " ";
        
        for (int i = 1; i <= N; i++) {
            if (arr[x][i] == 1 && !check[i]) {
                q.push(i);
                check[i] = true;
            }
        }
    }
}
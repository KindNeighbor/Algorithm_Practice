import sys
sys.setrecursionlimit(10**6)

T = int(sys.stdin.readline())

def dfs(x, y):
    graph[x][y] = '0'
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        
        if 0 <= nx < M and 0 <= ny < N and graph[nx][ny] == '1':
            dfs(nx, ny)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
            
for _ in range(T):
    M, N, K = map(int, sys.stdin.readline().split())
    graph = [['0'] * N for _ in range(M)]
    
    for _ in range(K):
        X, Y = map(int, sys.stdin.readline().split())
        graph[X][Y] = '1'
     
    result = 0
    
    for i in range(M):
        for j in range(N):
            if graph[i][j] == '1':
                dfs(i, j)
                result += 1
     
    print(result)
    
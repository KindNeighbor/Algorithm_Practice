import sys
sys.setrecursionlimit(10**6)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(x, y):
    global cnt
    visited[x][y] = 1
    cnt += 1
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        
        if 0 <= nx < M and 0 <= ny < N and visited[nx][ny] == 0 and graph[nx][ny] == 0:
            dfs(nx, ny)
        

M, N, K = map(int, sys.stdin.readline().split())

graph = [[0] * N for _ in range(M)]

for _ in range(K):
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())
    
    for i in range(y1, y2):
        for j in range(x1, x2):
            graph[i][j] = 1

visited = [[0] * N for _ in range(M)]

result = []

for i in range(M):
    for j in range(N):
        if visited[i][j] == 0 and graph[i][j] == 0:
            cnt = 0
            dfs(i, j)
            result.append(cnt)
            
print(len(result))
result.sort()
print(*result)
import sys
sys.setrecursionlimit(10**6)

def dfs(x, y):
    global cnt
    graph[x][y] = '0'
    cnt += 1
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < N and 0 <= ny < N and graph[nx][ny] == '1':
            dfs(nx, ny)
            
N = int(sys.stdin.readline())
graph = []
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for _ in range(N):
    graph.append(list(sys.stdin.readline().strip()))
    
result = []
cnt = 0

for i in range(N):
    for j in range(N):
        if graph[i][j] == '1':
            cnt = 0
            dfs(i, j)
            result.append(cnt)
            
print(len(result))
result.sort()
for r in result:
    print(r)
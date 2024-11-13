import sys
from collections import deque
sys.setrecursionlimit(10**6)

dx = [-1, 1, 0, 0, 0, 0]
dy = [0, 0, -1, 1, 0, 0]
dz = [0, 0, 0, 0, -1, 1]

def bfs():
    while queue:
        z, x, y = queue.popleft()
        
        for i in range(6):
            nz = z + dz[i]
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0 <= nz < H and 0 <= nx < N and 0 <= ny < M and visited[nz][nx][ny] == 0:
                visited[nz][nx][ny] = visited[z][x][y] + 1
                queue.append((nz, nx, ny))
    
    result = -2
    
    for i in range(H):
        for j in range(N):
            for k in range(M):
                if visited[i][j][k] == 0:
                    return -1
                result = max(result, visited[i][j][k])
    
    if result == 1:
        return 0
    else:
        return result - 1
    
M, N, H = map(int, sys.stdin.readline().split())
visited = [[[0] * M for _ in range(N)] for _ in range(H)]
queue = deque()

for i in range(H):
    for j in range(N):
        list1 = list(map(int, sys.stdin.readline().split()))
        for k in range(M):
            visited[i][j][k] = list1[k]
            if visited[i][j][k] == 1:
                queue.append((i, j, k))

print(bfs())
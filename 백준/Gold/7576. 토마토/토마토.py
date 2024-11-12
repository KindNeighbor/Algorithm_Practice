import sys
from collections import deque
sys.setrecursionlimit(10**6)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs():
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0 <= nx < N and 0 <= ny < M and not visited[nx][ny]:
                visited[nx][ny] = visited[x][y] + 1
                queue.append((nx, ny))
    
    result = -2
    
    for i in range(N):
        for j in range(M):
            if visited[i][j] == 0:
                return -1
            result = max(result, visited[i][j])
    
    if result == 1:
        return 0;
    else:
        return result - 1
    
M, N = map(int, sys.stdin.readline().split())
visited = [[0] * M for _ in range(N)]
queue = deque()

for i in range(N):
    list1 = list(map(int, sys.stdin.readline().split()))
    for j in range(M):
        visited[i][j] = list1[j]
        if visited[i][j] == 1:
            queue.append((i, j))
    
print(bfs())
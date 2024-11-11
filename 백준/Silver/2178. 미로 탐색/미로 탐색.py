import sys
from collections import deque
sys.setrecursionlimit(10**6)

def bfs(x, y):
    visited[x][y] = 1
    queue = deque([(x, y)])
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0 <= nx < N and 0 <= ny < M and graph[nx][ny] == '1' and visited[nx][ny] == 0:
                queue.append((nx, ny))
                visited[nx][ny] = visited[x][y] + 1
                
    return visited[N - 1][M - 1]

N, M = map(int, sys.stdin.readline().split())

graph = []
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for _ in range(N):
    graph.append(list(sys.stdin.readline().strip()))
    
visited = [[0] * M for _ in range(N)]

print(bfs(0, 0))
    

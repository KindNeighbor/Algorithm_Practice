import sys
from collections import deque
sys.setrecursionlimit(10**6)

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    visited[x][y] = 1
    queue = deque([(x, y)])
    
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0 <= nx < N and 0 <= ny < M and visited[nx][ny] == 0 and graph[nx][ny] == 1:
                visited[nx][ny] = visited[x][y] + 1
                queue.append((nx, ny))
               
    return visited

N, M = map(int, sys.stdin.readline().split())

graph = []

for _ in range(N):
    graph.append(list(map(int, sys.stdin.readline().strip())))
    
visited = [[0] * M for _ in range(N)]
result = []
result = bfs(0, 0)
print(result[N - 1][M - 1])
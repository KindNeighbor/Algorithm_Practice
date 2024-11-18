from collections import deque
import sys
input = sys.stdin.readline

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs():
    queue = deque([(0, 0, 1, 0)])
    visited[0][0][0] = 1
    
    while queue:
        x, y, dist, broke = queue.popleft()
        
        if x == N-1 and y == M-1:
            return dist
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0 <= nx < N and 0 <= ny < M:
                if graph[nx][ny] == 0 and visited[nx][ny][broke] == 0:
                    visited[nx][ny][broke] = 1
                    queue.append((nx, ny, dist+1, broke))
                elif graph[nx][ny] == 1 and broke == 0 and visited[nx][ny][1] == 0:
                    visited[nx][ny][1] = 1
                    queue.append((nx, ny, dist+1, 1))
    return -1

N, M = map(int, input().split())

graph = []
for i in range(N):
    graph.append(list(map(int, input().strip())))
visited = [[[0] * 2 for _ in range(M)] for _ in range(N)]

print(bfs())
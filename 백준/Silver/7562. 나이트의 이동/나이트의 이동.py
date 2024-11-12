import sys
from collections import deque
sys.setrecursionlimit(10**6)

T = int(sys.stdin.readline())

dx = [-2, -2, -1, -1, 1, 1, 2, 2]
dy = [1, -1, 2, -2, 2, -2, -1, 1]

def bfs(x1, y1, x2, y2, I):
    
    visited = [[0] * I for _ in range(I)]
    
    visited[x1][y1] = 1
    queue = deque([(x1, y1)])
   
    
    while queue:
        x, y = queue.popleft()
        
        if x == x2 and y == y2:
            return visited[x][y] - 1
    
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
        
            if 0 <= nx < I and 0 <= ny < I and not visited[nx][ny]:
                visited[nx][ny] = visited[x][y] + 1
                queue.append((nx, ny))
    return 0

for _ in range(T):
    
    I = int(sys.stdin.readline())
    
    x1, y1 = map(int, sys.stdin.readline().split())
    x2, y2 = map(int, sys.stdin.readline().split())
    
    print(bfs(x1, y1, x2, y2, I))
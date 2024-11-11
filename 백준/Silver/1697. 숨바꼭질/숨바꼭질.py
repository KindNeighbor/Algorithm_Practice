import sys
from collections import deque
sys.setrecursionlimit(10**6)

def bfs(N, K):
    visited = [-1] * 100001
    
    q = deque()
    q.append(N)
    visited[N] = 0
    
    while q:
        current = q.popleft()
        
        if current == K:
            return visited[current]
        
        for next_pos in [current - 1, current + 1, current * 2]:
            if 0 <= next_pos <= 100000 and visited[next_pos] == -1:
                q.append(next_pos)
                visited[next_pos] = visited[current] + 1
    
N, K = map(int, sys.stdin.readline().split())
print(bfs(N, K))
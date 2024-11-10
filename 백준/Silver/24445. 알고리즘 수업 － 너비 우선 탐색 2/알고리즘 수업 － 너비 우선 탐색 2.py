import sys
from collections import deque
sys.setrecursionlimit(10**6)

def bfs(graph, R, N):
    visited = [False] * (N + 1)
    order = [0] * (N + 1)
    visited[R] = True
    cnt = 1
    order[R] = cnt
    queue = deque([R])
    
    while queue:
        current = queue.popleft()
        
        for next_node in sorted(graph[current], reverse=True):
            if not visited[next_node]:
                cnt += 1
                visited[next_node] = True
                order[next_node] = cnt
                queue.append(next_node)
                
    return order

N, M, R = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(N + 1)]

for _ in range(M):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)
    
result = bfs(graph, R, N)

for i in range(1, N + 1):
    print(result[i])
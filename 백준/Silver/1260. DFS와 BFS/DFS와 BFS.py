import sys
from collections import deque
sys.setrecursionlimit(10**6)

def dfs(graph, R, visited_dfs):
    result_dfs.append(R)
    visited_dfs[R] = True
    
    for next_node in sorted(graph[R]):
        if not visited_dfs[next_node]:
            dfs(graph, next_node, visited_dfs)

def bfs(graph, R):
    visited_bfs = [False] * (N + 1)
    result_bfs = []
    visited_bfs[R] = True
    queue = deque([R])
    result_bfs.append(R)
    
    while queue:
        current = queue.popleft()
        
        for next_node in sorted(graph[current]):
            if not visited_bfs[next_node]:
                visited_bfs[next_node] = True
                queue.append(next_node)
                result_bfs.append(next_node)
                
    return result_bfs

N, M, R = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(N + 1)]

for i in range(M):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)
    
visited_dfs = [False] * (N + 1)
result_dfs = []

dfs(graph, R, visited_dfs)
result_bfs = bfs(graph, R)

print(*result_dfs)
print(*result_bfs)
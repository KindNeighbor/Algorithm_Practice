import sys
from collections import deque
sys.setrecursionlimit(10**6)

def dfs(graph, V, dfs_visited):
    dfs_visited[V] = True
    
    for next_node in sorted(graph[V]):
        if dfs_visited[next_node] is False:
            dfs_order.append(next_node)
            dfs(graph, next_node, dfs_visited)
            
def bfs(graph, V):
    bfs_visited[V] = True
    queue = deque([V])
    
    while queue:
        current = queue.popleft()
        
        for next_node in sorted(graph[current]):
            if bfs_visited[next_node] is False:
                bfs_visited[next_node] = True
                bfs_order.append(next_node)
                queue.append(next_node)

N, M, V = map(int, sys.stdin.readline().split())

graph = [[] for _ in range(N + 1)]

for _ in range(M):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)
    
dfs_visited = [False] * (N + 1)
bfs_visited = [False] * (N + 1)
dfs_order = []
bfs_order = []

dfs_order.append(V)
bfs_order.append(V)

dfs(graph, V, dfs_visited)
bfs(graph, V)

print(*dfs_order)
print(*bfs_order)
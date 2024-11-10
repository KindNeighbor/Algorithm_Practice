import sys
sys.setrecursionlimit(10**6)

def dfs(graph, R, visited):
    visited[R] = True
    
    for next_node in sorted(graph[R]):
        if not visited[next_node]:
            dfs(graph, next_node, visited)

N = int(sys.stdin.readline())
M = int(sys.stdin.readline())

graph = [[] for _ in range(N + 1)]

for _ in range(M):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)
    
visited = [False] * (N + 1)

dfs(graph, 1, visited)
print(sum(visited) - 1)
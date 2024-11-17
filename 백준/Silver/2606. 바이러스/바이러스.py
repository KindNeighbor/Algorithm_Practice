import sys
sys.setrecursionlimit(10**6)

def dfs(graph, R, visited):
    global cnt
    visited[R] = True
    cnt += 1
    
    for next_node in graph[R]:
        if visited[next_node] is False:
            dfs(graph, next_node, visited)

N = int(sys.stdin.readline())
M = int(sys.stdin.readline())

graph = [[] for _ in range(N + 1)]

for _ in range(M):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)

visited = [False] * (N + 1)
cnt = 0

dfs(graph, 1, visited)

print(cnt - 1)
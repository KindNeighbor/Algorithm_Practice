import sys
sys.setrecursionlimit(10**6)

def dfs(graph, R, visited, order):
    global cnt
    visited[R] = True
    order[R] = cnt
    cnt += 1
    
    for next_node in sorted(graph[R], reverse=True):
        if not visited[next_node]:
            dfs(graph, next_node, visited, order)

N, M, R = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(N + 1)]

for _ in range(M):
    u, v = map(int, sys.stdin.readline().split())
    graph[u].append(v)
    graph[v].append(u)
    
visited = [False] * (N + 1)
order = [0] * (N + 1)
cnt = 1

dfs(graph, R, visited, order)

for i in range(1, N + 1):
    print(order[i])
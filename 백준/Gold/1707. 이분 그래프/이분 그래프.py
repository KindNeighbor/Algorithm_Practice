import sys
sys.setrecursionlimit(10**6)

def dfs(graph, R, visited):

    for next_node in sorted(graph[R]):
        if visited[next_node] == 0:
            visited[next_node] = (-1) * visited[R]
            if not dfs(graph, next_node, visited):
                return False
        elif visited[next_node] == visited[R]:
            return False
    return True

T = int(sys.stdin.readline())

for _ in range(T):
    V, E = map(int, sys.stdin.readline().split())
    
    graph = [[] for _ in range(V + 1)]
    
    for _ in range(E):
        u, v = map(int, sys.stdin.readline().split())
        graph[u].append(v)
        graph[v].append(u)
    
    visited = [0] * (V + 1)
    checkGraph = True
    
    for i in range(1, V + 1):
        if visited[i] == 0:
            visited[i] = 1
            if not dfs(graph, i, visited):
                checkGraph = False
                break
    print("YES" if checkGraph else "NO")
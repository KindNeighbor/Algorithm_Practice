import heapq

def dijkstra(graph, start, n):
    distances = [float('inf')] * (n + 1)
    distances[start] = 0
    queue = [(0, start)]
    
    while queue:
        curr_dist, curr = heapq.heappop(queue)
        
        if distances[curr] < curr_dist:
            continue
           
        for next_node, weight in graph[curr]:
            distance = curr_dist + weight
            
            if distance < distances[next_node]:
                distances[next_node] = distance
                heapq.heappush(queue, (distance, next_node))
                
                
    return distances

def sol():
    n, m, t = map(int, input().split())
    s, g, h = map(int, input().split())
    
    graph = [[] for _ in range(n + 1)]
    gh_dist = 0
    
    for _ in range(m):
        a, b, d = map(int, input().split())
        graph[a].append((b, d))
        graph[b].append((a, d))
        if (a == g and b == h) or (a == h and b == g):
            gh_dist = d
            
    candidates = [int(input()) for _ in range(t)]

    s_dist = dijkstra(graph, s, n)
    g_dist = dijkstra(graph, g, n)
    h_dist = dijkstra(graph, h, n)
    
    result = []
    for cand in candidates:
        
        if s_dist[cand] == float('inf'):
            continue
        
        path1 = s_dist[g] + gh_dist + h_dist[cand]
        path2 = s_dist[h] + gh_dist + g_dist[cand]
        min_gh_path = min(path1, path2) 
        
        if min_gh_path == s_dist[cand]:
            result.append(cand)
        
    return sorted(result)

T = int(input())
for _ in range(T):
    result = sol()
    print(*result)
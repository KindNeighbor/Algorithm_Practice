import heapq
import sys

def dijkstra(V, K, graph):
    distances = [float('INF')] * (V + 1)
    distances[K] = 0
    queue = []
    heapq.heappush(queue, (0, K))
    
    while queue:
        current_dist, current_vertex = heapq.heappop(queue)
        
        if distances[current_vertex] < current_dist:
            continue
            
        for next_vertex, weight in graph[current_vertex]:
            distance = current_dist + weight
            
            if distance < distances[next_vertex]:
                distances[next_vertex] = distance
                heapq.heappush(queue, (distance, next_vertex))
                
    return distances

V, E = map(int, sys.stdin.readline().split())
K = int(sys.stdin.readline())
graph = [[] for _ in range(V + 1)]

for _ in range(E):
    u, v, w = map(int, sys.stdin.readline().split())
    graph[u].append((v, w))
    
result = dijkstra(V, K, graph)
for i in range(1, V + 1):
    print('INF' if result[i] == float('INF') else result[i])
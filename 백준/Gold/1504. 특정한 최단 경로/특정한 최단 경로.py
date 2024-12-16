import heapq
import sys
INF = sys.maxsize

def dijkstra(start, graph, n):
    distances = [INF] * (n + 1)
    distances[start] = 0
    queue = []
    heapq.heappush(queue, (0, start))
    
    while queue:
        current_distance, current_node = heapq.heappop(queue)
        
        if distances[current_node] < current_distance:
            continue
            
        for adjacent, weight in graph[current_node]:
            distance = current_distance + weight
            
            if distance < distances[adjacent]:
                distances[adjacent] = distance
                heapq.heappush(queue, (distance, adjacent))
                
    return distances

n, e = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(n + 1)]

for _ in range(e):
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a].append((b, c))
    graph[b].append((a, c))
    
v1, v2 = map(int, sys.stdin.readline().split())

from_start = dijkstra(1, graph, n)
from_v1 = dijkstra(v1, graph, n)
from_v2 = dijkstra(v2, graph, n)

path1 = from_start[v1] + from_v1[v2] + from_v2[n]
path2 = from_start[v2] + from_v2[v1] + from_v1[n]

result = min(path1, path2)
print(-1 if result >= INF else result)
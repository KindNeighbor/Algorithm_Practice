import heapq
import sys
INF = sys.maxsize
MAX = 100001

def dij(n, k):
    dis = [INF] * MAX
    dis[n] = 0
    queue = [(0, n)]
    
    while queue:
        time, pos = heapq.heappop(queue)
        
        if time > dis[pos]:
            continue
           
        if pos == k:
            return time
         
        if pos * 2 < MAX and dis[pos * 2] > time:
            dis[pos * 2] = time
            heapq.heappush(queue, (time, pos * 2))

        if pos > 0 and dis[pos - 1] > time + 1:
            dis[pos - 1] = time + 1
            heapq.heappush(queue, (time + 1, pos - 1))

        if pos + 1 < MAX and dis[pos + 1] > time + 1:
            dis[pos + 1] = time + 1
            heapq.heappush(queue, (time + 1, pos + 1))
    
    return -1

n, k = map(int, input().split())
print(dij(n, k))
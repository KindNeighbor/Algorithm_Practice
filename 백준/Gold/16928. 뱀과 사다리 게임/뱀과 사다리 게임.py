import sys
from collections import deque
sys.setrecursionlimit(10**6)

def bfs(ladders, snakes):
    move = [0] * 101
    
    for x, y in ladders:
        move[x] = y
    for u, v in snakes:
        move[u] = v
        
    queue = deque([(1, 0)])
    visited = [False] * 101
    visited[1] = True
    
    while queue:
        pos, cnt = queue.popleft()
        
        if pos == 100:
            return cnt
        
        for dice in range(1, 7):
            next_pos = pos + dice
            
            if next_pos > 100:
                continue
            
            if move[next_pos] != 0:
                next_pos = move[next_pos]
                                
            if not visited[next_pos]:
                visited[next_pos] = True
                queue.append((next_pos, cnt + 1))
                   
    return -1
    
N, M = map(int, sys.stdin.readline().split())
ladders = [tuple(map(int, sys.stdin.readline().split())) for _ in range(N)]
snakes = [tuple(map(int, sys.stdin.readline().split())) for _ in range(M)]
                         
print(bfs(ladders, snakes))
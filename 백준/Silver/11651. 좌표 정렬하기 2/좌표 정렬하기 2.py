import sys

N = int(sys.stdin.readline())

result = []

for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())
    result.append((x, y))
    
result.sort(key=lambda x : (x[1], x[0]))

for x, y in result:
    print(x, y)
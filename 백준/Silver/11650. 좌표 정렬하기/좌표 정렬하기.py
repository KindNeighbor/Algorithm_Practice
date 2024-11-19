import sys

N = int(sys.stdin.readline())

result = []

for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())
    result.append((x, y))
    
result = sorted(result, key=lambda x: (x[0], x[1]))

for x, y in result:
    print(str(x) + " " + str(y))
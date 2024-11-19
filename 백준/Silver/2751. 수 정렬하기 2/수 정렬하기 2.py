import sys
N = int(sys.stdin.readline())

result = []

for i in range(N):
    a = int(sys.stdin.readline())
    result.append(a)
    
result.sort()

for i in range(N):
    print(result[i])
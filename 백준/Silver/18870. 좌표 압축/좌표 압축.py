import sys
N = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split()))
compressed = {value: idx for idx, value in enumerate(sorted(set(arr)))}

result = [compressed[x] for x in arr]

print(*result)
import sys
N = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split()))

set1 = set(arr)

sorted_list = sorted(set1)

compressed = {value: idx for idx, value in enumerate(sorted(set(arr)))}

result = [compressed[x] for x in arr]

print(*result)
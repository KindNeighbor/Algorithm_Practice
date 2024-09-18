import sys

N, M = map(int, sys.stdin.readline().split())

list1 = [0] * N

for i in range(N):
    list1[i] = i + 1

for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())
    a = list1[i-1]
    b = list1[j-1]
    list1[i-1] = b
    list1[j-1] = a
    
print(' '.join(map(str, list1)))
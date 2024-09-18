import sys

N, M = map(int, sys.stdin.readline().split())

list1 = [0] * N

for _ in range(M):
    i, j, k = map(int, sys.stdin.readline().split())
    for i in range(i - 1, j):
        list1[i] = k

print(' '.join([str(a) for a in list1]))
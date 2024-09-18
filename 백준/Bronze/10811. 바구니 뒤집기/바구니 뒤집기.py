import sys

N, M = map(int, sys.stdin.readline().split())

list1 = list(range(1, N + 1))

for _ in range(M):
    i, j = map(int, sys.stdin.readline().split())
    list1[i-1:j] = reversed(list1[i-1:j])

print(*list1)
import sys

N = int(sys.stdin.readline())
S = sys.stdin.readline()

a = 0

for i in range(N):
    a += int(S[i])

print(a)
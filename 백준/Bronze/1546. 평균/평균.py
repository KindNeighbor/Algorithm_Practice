import sys

N = int(sys.stdin.readline())

list1 = list(map(int, sys.stdin.readline().split()))

list1.sort()

sum = 0

for i in range(N):
    sum += 100 * (list1[i] / list1[-1])

print(sum / N)
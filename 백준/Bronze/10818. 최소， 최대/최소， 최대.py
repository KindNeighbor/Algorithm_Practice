import sys

N = int(sys.stdin.readline())

list1 = list(map(int, sys.stdin.readline().split()))

list1.sort()

print(list1[0], list1[-1])
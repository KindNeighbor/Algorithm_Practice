import sys

list1 = [0] * 30

for _ in range(28):
    a = int(sys.stdin.readline())
    list1[a-1] = 1

for i in range(30):
    if list1[i] == 0:
        print(i+1)
N = int(input())
set1 = set(map(int, input().split()))

M = int(input())
arr = list(map(int, input().split()))

for a in arr:
    if a in set1:
        print(1)
    else:
        print(0)
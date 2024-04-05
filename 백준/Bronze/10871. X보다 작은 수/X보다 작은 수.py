A, B = map(int, input().split())

arr = list(map(int, input().split()))

for i in arr:
    if i < B:
        print(i, end=" ")
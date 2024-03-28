N = int(input())
list = list(map(int, input().split()))
target = int(input())

cnt = 0
for num in list:
    if num == target:
        cnt += 1

print(cnt)
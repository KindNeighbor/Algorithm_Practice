N = int(input())

num = 1
a = 6
cnt = 1

if N == 1:
    print(1)
    exit()

while(True):
    if num < N:
        num += a * cnt
        cnt += 1
    else:
        break
print(cnt)
N, Q = map(int, input().split(" "))

Alist = [int(input()) for _ in range(N)]
Blist = [int(input()) for _ in range(Q)]

result = []

idx = 1

for a in Alist:
    for _ in range(a):
        result.append(idx)
    idx += 1
    
for b in Blist:
    print(result[b])
import sys

N, K = map(int, sys.stdin.readline().split())

list1 = []

for i in range(N):
    A = int(sys.stdin.readline())
    list1.append(A)
    
list1.sort(reverse=True)

cnt = 0
idx = 0

while (K > 0):
    if list1[idx] <= K:
        current = K // list1[idx]
        cnt += current 
        K -= list1[idx] * current 
    idx += 1
        
print(cnt)
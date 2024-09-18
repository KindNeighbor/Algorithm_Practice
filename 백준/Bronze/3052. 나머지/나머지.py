import sys

list1 = [0] * 42

for _ in range(10):
    a = int(sys.stdin.readline())
    b = a % 42
    list1[b-1] += 1

cnt = 0
for i in range(42):
    if list1[i] > 0:
        cnt += 1
        
print(cnt)
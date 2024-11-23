import sys

def bn_search(l, r):
    while l <= r:
        mid = (l + r) // 2
        if mid == 0:
            mid = 1
        cnt = 0
        
        for i in range(len(wires)):
            cnt += wires[i] // mid
        
        if cnt < N:
            r = mid - 1
        else:
            l = mid + 1
            
    print(r)

K, N = map(int, sys.stdin.readline().split())

wires = {}

right = 0

for i in range(K):
    wire = int(sys.stdin.readline())
    wires[i] = wire
    if right < wires[i]:
        right = wires[i]
        
right += 1
left = 0

bn_search(left, right)
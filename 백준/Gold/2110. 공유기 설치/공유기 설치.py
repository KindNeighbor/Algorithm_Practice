import sys

def can_install(houses, dist, C):
    count = 1
    last = houses[0]
    
    for i in range(1, len(houses)):
        if houses[i] - last >= dist:
            count += 1
            last = houses[i]
    
    return count >= C

def bn_search(N, C, houses):
    houses.sort()
    
    start = 1 
    end = houses[-1] - houses[0] 
    result = 0
    
    while start <= end:
        mid = (start + end) // 2
        if can_install(houses, mid, C):
            result = mid 
            start = mid + 1
        else:
            end = mid - 1
    
    return result

N, C = map(int, sys.stdin.readline().split())

houses = []

for i in range(N):
    x = int(sys.stdin.readline())
    houses.append(x)

print(bn_search(N, C, houses))
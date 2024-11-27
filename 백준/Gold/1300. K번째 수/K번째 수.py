import sys

def bn_search(l, r):
    ans = 0
    while l <= r:
        mid = (l + r) // 2
        sum = 0
        
        for i in range(1, N + 1):
            sum += min(mid // i, N)
        
        if sum >= k:
            ans = mid
            r = mid - 1
        else:
            l = mid + 1
    print(ans)

N = int(sys.stdin.readline())

k = int(sys.stdin.readline())

bn_search(1, N*N)
import sys

def bn_search(l, r):
    while l <= r:
        mid = (l + r) // 2
        
        length = 0
        
        for branche in branches_list :
            length += max(0, branche - mid)
            
        if length < M:
            r = mid - 1
        else:
            result = mid
            l = mid + 1
            
    print(result)
    

N, M = map(int, sys.stdin.readline().split())
branches_list = list(map(int, sys.stdin.readline().split()))

right = 0
left = 0

bn_search(0, max(branches_list))
def solution(arr):
    a = len(arr)
    b = len(arr[0])
    
    if a == b:
        return arr
    
    c = max(a,b)
    ans = [[0]*c for _ in range(c)]
            
    for i in range(a):
        for j in range(b):
            ans[i][j] = arr[i][j]
    
    return ans
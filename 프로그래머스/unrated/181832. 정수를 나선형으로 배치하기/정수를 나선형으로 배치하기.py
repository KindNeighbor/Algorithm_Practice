def solution(n):
    arr = [[0]*n for _ in range(n)]
    idx = 1
    a = 0
    b = 0
    c = n
    while idx <= n*n:
        for i in range(b, c):
            arr[a][i] = idx
            idx += 1

        for i in range(a+1, c):
            arr[i][c-1] = idx
            idx += 1
        
        for i in range(c-2, b-1,-1):
            arr[c-1][i] = idx
            idx += 1
            
        for i in range(c-2,a,-1):
            arr[i][b] = idx
            idx += 1
        
        a += 1
        b += 1
        c -= 1
            
    return arr
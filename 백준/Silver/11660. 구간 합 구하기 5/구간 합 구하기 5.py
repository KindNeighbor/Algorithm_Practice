import sys

input = sys.stdin.readline

n, m = map(int, input().split())
A = [[0] * (n+1)]
B = [[0] * (n+1) for _ in range(n+1)]

for i in range(n):
    A_row = [0] + [int(x) for x in input().split()]
    A.append(A_row)
    
for i in range(n+1):
    B[i][1] = B[i - 1][1] + A[i][1]
    B[1][i] = B[1][i-1] + A[1][i]
 
for i in range(2, n+1):
    for j in range(1, n+1):
        B[i][j] = B[i][j-1] + B[i-1][j] - B[i-1][j-1] + A[i][j]
        
for _ in range(m):
    x1, y1, x2, y2 = map(int, input().split())
    result = B[x2][y2] - B[x1-1][y2] - B[x2][y1-1] + B[x1-1][y1-1]
    print(result)
    
        
n,m = map(int, input().split())

matrix_A = []
for _ in range(n):
    row = list(map(int, input().split()))
    matrix_A.append(row)

matrix_B = []
for _ in range(n):
    row = list(map(int, input().split()))
    matrix_B.append(row)

result = []
for i in range(n):
    summed_row = [matrix_A[i][j] + matrix_B[i][j] for j in range(m)]
    result.append(summed_row)

for row in result:
    print(' '.join(map(str, row)))
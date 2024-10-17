A = [[0 for _ in range(9)] for _ in range(9)]

for i in range(9):
    A[i] = list(map(int, input().split()))
    
max = 0

idx1 = -1
idx2 = -1

for i in range(9):
    for j in range(9):
        if max <= A[i][j]:
            max = A[i][j]
            idx1 = i
            idx2 = j

print(max)
print(str(idx1 + 1) + " " + str(idx2 + 1))
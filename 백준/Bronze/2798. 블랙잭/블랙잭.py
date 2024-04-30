N,M = map(int, input().split())

A = list(map(int, input().split()))

near = 0

for i in range(0, len(A)):
    for j in range(i + 1, len(A)):
        for k in range(j + 1, len(A)):
            sum = A[i] + A[j] + A[k]
            if near < sum and sum <= M:
                near = sum
                
print(near)
            
    


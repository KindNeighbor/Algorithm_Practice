N, M = map(int, input().split())

list1 = list(map(int, input().split()))

maxSum = -1

for i in range(0, N-2):
    for j in range(i+1, N-1):
        for k in range(j+1, N):
            sum1 = list1[i] + list1[j] + list1[k]
            if sum1 <= M:
                if sum1 >= maxSum:
                    maxSum = sum1

print(maxSum)
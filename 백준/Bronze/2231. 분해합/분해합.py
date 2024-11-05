N = int(input())

result = 0

for i in range(N):
    num = i
    sum1 = 0
    while(num != 0):
        sum1 += num % 10
        num //= 10
    if (i + sum1) == N:
        result = i
        break
        
print(result)
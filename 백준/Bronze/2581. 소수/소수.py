def checkPrime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

M = int(input())
N = int(input())

sum = 0
min = 10001
for i in range(M, N + 1):
    if checkPrime(i):
        sum += i
        if min >= i:
            min = i

if sum == 0:
    print(-1)
else:
    print(sum)
    print(min)
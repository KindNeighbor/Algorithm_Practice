N = int(input())

list1 = list(map(int, input().split()))

def checkPrime(num):
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

cnt = 0

for i in range(len(list1)):
    a = list1[i]
    if a == 1:
        continue
    if checkPrime(a):
        cnt += 1
        
print(cnt)
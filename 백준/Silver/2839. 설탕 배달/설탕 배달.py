N = int(input())

result = 1000000
check = False

for i in range(5000):
    for j in range(5000):
        if 3*i + 5*j == N:
            check = True
            result = min(i+j, result)
            
if check is True:
    print(result)
else:
    print(-1)
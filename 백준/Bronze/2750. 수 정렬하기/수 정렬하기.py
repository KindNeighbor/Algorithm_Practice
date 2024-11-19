N = int(input())

result = []

for i in range(N):
    a = int(input())
    result.append(a)
 
result.sort()

for i in range(len(result)):
    print(result[i])
result = []
for i in range(5):
    a = int(input())
    result.append(a)
    
result.sort()

sum1 = 0

for a in result:
    sum1 += a

avg = sum1 // 5
middle = result[2]

print(avg)
print(middle)
a, b = input().strip().split(' ')
b = int(b)
s = a
for i in range(b - 1): 
    s += a
print(s)
    
N = int(input())
a = 3

for i in range(1, N):
    a += 2 ** i

print(a * a)
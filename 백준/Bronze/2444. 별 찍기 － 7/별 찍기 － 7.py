N = int(input())
a = (2 * N - 1) // 2
b = (2 * N - 1) - a

for i in range(a):
    print(" " * (a - i) + "*" * (2 * i + 1))

for i in range(b, 0, -1):
    print(" " * (b - i) + "*" * (2 * i - 1))
import sys

a = int(sys.stdin.readline())
b = 1
c = 2
while c * c < a + 1:
    b += 1
    c += 1
print(b)
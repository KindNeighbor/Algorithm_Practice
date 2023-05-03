import sys

a,b = map(int, sys.stdin.readline().split())
c,d = map(int, sys.stdin.readline().split())

e = a*d + b*c
f = b*d

def GCD(a,b):
    if a%b==0:
        return b
    return GCD(b,a%b)

g = GCD(e,f)
h = e//g
i = f//g
print(h,i)

import sys

n = int(sys.stdin.readline())
d = dict()

for x in range(n):
    a, b = map(str, sys.stdin.readline().split())
    
    if b == "enter":
        d[a] = b
    else:
        del d[a]
        
d = sorted(d.keys(), reverse=True)

for i in d:
    print(i)
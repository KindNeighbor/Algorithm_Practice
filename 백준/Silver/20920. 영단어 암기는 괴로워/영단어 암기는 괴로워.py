import sys

a, b = map(int, sys.stdin.readline().split())

d = {}
for _ in range(a):
    s = sys.stdin.readline().rstrip()
    if len(s) >= b:
        d[s] = d.get(s, 0) + 1

ss = sorted(d.keys(), key=lambda x: (-d[x], -len(x), x))

for x in ss:
    print(x)
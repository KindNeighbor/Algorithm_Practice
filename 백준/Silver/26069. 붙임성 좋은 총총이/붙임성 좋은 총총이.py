import sys

a = int(sys.stdin.readline())
b = set()
b.add("ChongChong")
for _ in range(a):
    s1, s2 = sys.stdin.readline().split()
    if s1 in b and s2 not in b:
         b.add(s2)
    elif s2 in b and s1 not in b:
         b.add(s1)
print(len(b))
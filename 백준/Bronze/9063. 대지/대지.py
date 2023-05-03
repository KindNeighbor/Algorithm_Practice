a = int(input())
h = []
w = []
for i in range(a):
    b, c = map(int, input().split())
    w.append(b)
    h.append(c)
w.sort()
h.sort()

print((w[len(w) - 1] - w[0]) * (h[len(h) - 1] - h[0]))
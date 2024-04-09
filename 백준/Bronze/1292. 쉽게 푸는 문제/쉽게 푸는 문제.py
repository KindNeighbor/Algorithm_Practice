A, B = map(int, input().split())

seq = []
for i in range(1, 50):
    seq += [i] * i

print(sum(seq[A-1:B]))
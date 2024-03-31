A, B = input().split(" ")

alist = list(A)
blist = list(B)

a = int(''.join(alist[::-1]))
b = int(''.join(blist[::-1]))

if a > b:
    print(a)
else:
    print(b)


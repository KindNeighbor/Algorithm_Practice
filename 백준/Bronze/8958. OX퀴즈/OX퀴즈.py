A = int(input())

for i in range(A):
    a = input()
    b = 0
    c = 0
    for j in a:
        if j == 'O':
            b += 1
            c += b
        else:
            b = 0
    print(c)
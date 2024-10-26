N = int(input())

for _ in range(N):
    C = int(input())
    
    q = 0
    d = 0
    n = 0
    p = 0
    
    q = C // 25
    d = (C - 25 * q) // 10
    n = (C - 25 * q - 10 * d) // 5
    p = (C - 25 * q - 10 * d - 5 * n)
    
    print(str(q) + " " + str(d) + " " + str(n) + " " + str(p))
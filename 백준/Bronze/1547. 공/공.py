M = int(input())

cups = [1, 2, 3]

for _ in range(M):
    X, Y = map(int, input().split())
    
    x1 = cups.index(X)
    y1 = cups.index(Y)
    
    cups[x1], cups[y1] = cups[y1], cups[x1]
    
print(cups[0])
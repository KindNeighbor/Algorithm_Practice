name = input()

N = int(input())

L = 0
O = 0
V = 0
E = 0

for c in name:
    if c == 'L':
        L += 1
    elif c == 'O':
        O += 1
    elif c == 'V':
        V += 1 
    elif c == 'E':
        E += 1
        
max = -1
maxTeam = ""
for _ in range(0, N):
    L1 = 0
    O1 = 0
    V1 = 0
    E1 = 0
    teamName = input()
    for c in teamName:
        if c == 'L':
            L += 1
            L1 += 1
        elif c == 'O':
            O += 1
            O1 += 1
        elif c == 'V':
            V += 1 
            V1 += 1
        elif c == 'E':
            E += 1
            E1 += 1
    tmp = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100
    if tmp > max or (tmp == max and teamName < maxTeam):
        max = tmp
        maxTeam = teamName
    L -= L1
    O -= O1
    V -= V1
    E -= E1
print(maxTeam)    
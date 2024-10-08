word = input().upper()
alpha = {}

for c in word:
    alpha[c] = alpha.get(c, 0) + 1
    
maxCnt = max(alpha.values()) if alpha else 0
check = [c for c, cnt in alpha.items() if cnt == maxCnt]

if len(check) > 1:
    print("?")
else:
    print(check[0])
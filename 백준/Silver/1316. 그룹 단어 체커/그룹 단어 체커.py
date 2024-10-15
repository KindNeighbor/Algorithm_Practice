N = int(input())

cnt = 0

def isGroupWord(word):
    seen = set()
    before_c = ""
    for c in word:
        if c != before_c and c in seen:
            return False
        else:
            seen.add(c)
            before_c = c
    return True

for _ in range(N):
    str1 = input()
    check = isGroupWord(str1)
    if check is True:
        cnt += 1

print(cnt)
            
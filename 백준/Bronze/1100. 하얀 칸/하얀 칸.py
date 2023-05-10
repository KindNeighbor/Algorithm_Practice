import sys

cnt = 0
for i in range(8):
    s = sys.stdin.readline()
    if i % 2 == 0:
        for j in range(len(s)):
            if j%2 == 0:
                if s[j] == "F":
                    cnt += 1
    else : 
        for j in range(len(s)):
            if j%2 != 0:
                if s[j] == "F":
                    cnt += 1
print(cnt)
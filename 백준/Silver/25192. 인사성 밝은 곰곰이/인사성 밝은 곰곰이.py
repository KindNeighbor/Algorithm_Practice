import sys

a = int(sys.stdin.readline());
arr = set()
cnt = 0
for _ in range(a):
    s = sys.stdin.readline().strip();
    if s == "ENTER":
        arr = set()
    else :
        if s not in arr:
            arr.add(s)
            cnt += 1
print(cnt)
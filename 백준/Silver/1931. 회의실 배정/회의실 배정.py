import sys

N = int(sys.stdin.readline())
meetings = []

for _ in range(N):
    a, b = map(int, sys.stdin.readline().split())
    meetings.append((a, b))

meetings.sort(key=lambda x: (x[1], x[0]))

cnt = 1
endT = meetings[0][1]

for i in range(1, N):
    if meetings[i][0] >= endT:
        endT = meetings[i][1]
        cnt += 1
        
print(cnt)
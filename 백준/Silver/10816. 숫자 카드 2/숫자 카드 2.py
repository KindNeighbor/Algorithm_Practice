import sys

N = int(sys.stdin.readline())

cards = {}
numbers = list(map(int, sys.stdin.readline().split()))

for num in numbers:
    if num in cards:
        cards[num] += 1
    else:
        cards[num] = 1

M = int(sys.stdin.readline())

targets = list(map(int, sys.stdin.readline().split()))
result = []

for a in targets:
    if a in cards:
        result.append(cards[a])
    else:
        result.append(0)
        
print(*result)
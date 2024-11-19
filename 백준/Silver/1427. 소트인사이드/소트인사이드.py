import sys

result = list(map(int, sys.stdin.readline().strip()))

result.sort(reverse=True)
print(''.join(map(str, result)))
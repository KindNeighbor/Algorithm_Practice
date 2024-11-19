import sys

N = int(sys.stdin.readline())

result = set()

for _ in range(N):
    str1 = sys.stdin.readline().strip()
    result.add(str1)
    
sorted_result = sorted(result, key=lambda x: (len(x), x))

for s in sorted_result:
    print(s)
def count_zero(n, m):
    count = 0
    for number in range(n, m + 1):
        count += str(number).count('0')
    return count

T = int(input())

results = []
for _ in range(T):
    N, M = map(int, input().split())
    results.append(count_zero(N, M))

for result in results:
    print(result)

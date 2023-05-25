import sys

T = int(sys.stdin.readline())

for _ in range(T):
    K = int(sys.stdin.readline())
    arr = [0] * (K+1)
    dp = [[0] * (K+1) for _ in range(K+1)]
    files = list(map(int, sys.stdin.readline().split()))

    for j in range(1, K+1):
        arr[j] = arr[j-1] + files[j-1]

    for a in range(1, K):
        for start in range(1, K-a+1):
            end = start + a
            dp[start][end] = sys.maxsize
            for mid in range(start, end):
                dp[start][end] = min(dp[start][end], dp[start][mid] + dp[mid+1][end] + arr[end] - arr[start-1])

    print(dp[1][K])
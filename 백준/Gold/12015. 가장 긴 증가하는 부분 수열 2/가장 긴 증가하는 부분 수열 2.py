import sys

def binary_search(arr, target):
    left, right = 0, len(arr)-1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return left

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
dp = []

for num in A:
    if not dp or dp[-1] < num:
        dp.append(num)
    else:
        pos = binary_search(dp, num)
        dp[pos] = num

print(len(dp))
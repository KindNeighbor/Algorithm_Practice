A = int(input())

for _ in range(A):
    nums = list(map(int, input().split()))
    avg = sum(nums[1:]) / nums[0]
    cnt = 0
    for i in nums[1:]:
        if i > avg:
            cnt += 1
    ans = cnt / nums[0] * 100
    print('{:.3f}%'.format(ans))
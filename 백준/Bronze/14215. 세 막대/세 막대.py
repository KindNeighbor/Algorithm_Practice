a,b,c = map(int, input().split())
arr = []
arr.append(a)
arr.append(b)
arr.append(c)

arr.sort()
if arr[0] + arr[1] > arr[2]:
    print(arr[0] + arr[1] + arr[2])
else: print(2 * (arr[0] + arr[1]) - 1)
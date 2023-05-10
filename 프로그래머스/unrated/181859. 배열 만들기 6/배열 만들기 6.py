def solution(arr):
    a = []
    for i in range(len(arr)):
        if len(a) == 0:
            a.append(arr[i])
        elif a[len(a)-1] == arr[i]:
            a.pop()
        elif a[len(a)-1] != arr[i]:
            a.append(arr[i])
    if len(a) == 0:
        return [-1]
    else: return a
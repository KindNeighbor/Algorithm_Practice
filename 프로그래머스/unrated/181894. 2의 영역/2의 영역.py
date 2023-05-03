def solution(arr):
    a = []
    for i in range(len(arr)):
        if arr[i] == 2:
            a.append(i)
    if len(a) == 0:
        return [-1]
    return arr[a[0]:a[len(a) - 1]+1]
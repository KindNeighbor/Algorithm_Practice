def solution(arr, flag):
    a = []
    for i in range(len(arr)):
        if flag[i]:
            b = arr[i] * 2
            for j in range(b):
                a.append(arr[i])
        else:
            a = a[:-arr[i]]
    return a
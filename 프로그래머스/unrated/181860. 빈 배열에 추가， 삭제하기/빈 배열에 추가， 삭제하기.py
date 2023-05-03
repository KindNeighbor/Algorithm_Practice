def solution(arr, flag):
    a = []
    for i in range(len(arr)):
        b = arr[i]
        if flag[i]:
            for j in range(b*2):
                a.append(arr[i])
        else:
            for j in range(b):
                a.pop()
    return a
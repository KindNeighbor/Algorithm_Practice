def solution(arr1, arr2):
    s1 = 0
    s2 = 0
    for a in arr1:
        s1 += a
    for a in arr2:
        s2 += a
    if len(arr1) > len(arr2):
        return 1
    elif len(arr1) < len(arr2):
        return -1
    elif len(arr1) == len(arr2):
        if s1 > s2:
            return 1
        elif s1 < s2:
            return -1
        else: return 0
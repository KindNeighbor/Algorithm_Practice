def solution(strArr):
    a = []
    for s in strArr:
        if "ad" not in s:
            a.append(s)
    return a
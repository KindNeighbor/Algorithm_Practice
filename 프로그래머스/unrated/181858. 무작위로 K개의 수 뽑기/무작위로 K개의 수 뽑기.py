def solution(arr, k):
    a = set()
    b = []
    for x in arr:
        if x not in a:
            a.add(x)
            b.append(x)
            if len(b) == k:
                break
    while len(b) < k:
        b.append(-1)
    return b

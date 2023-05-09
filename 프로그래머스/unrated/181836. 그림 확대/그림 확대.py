def solution(picture, k):
    s = ""
    a = []
    for x in picture:
        for i in range(len(x)):
            for _ in range(k):
                s += x[i]
        for _ in range(k):
            a.append(s)
        s = ""
    return a
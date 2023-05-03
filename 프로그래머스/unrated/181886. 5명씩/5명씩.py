def solution(names):
    a = []
    for i in range(len(names)):
        if i % 5 == 0:
            a.append(names[i])
    return a
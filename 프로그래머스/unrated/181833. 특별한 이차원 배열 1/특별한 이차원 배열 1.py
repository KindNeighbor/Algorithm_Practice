def solution(n):
    a = [[0] * n for a in range(n)]
    for i in range(n):
        for j in range(n):
            if i == j:
                a[i][j] = 1
    return a
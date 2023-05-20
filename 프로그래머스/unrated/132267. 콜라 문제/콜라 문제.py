def solution(a, b, n):
    cnt = 0
    while n >= a:
        c = n // a
        cnt += (c*b)
        n = n - (c*a) + (c*b)

    return cnt
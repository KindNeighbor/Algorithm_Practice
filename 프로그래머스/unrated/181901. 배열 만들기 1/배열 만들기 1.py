def solution(n, k):
    a = k
    answer = []
    while a <= n:
        answer.append(a)
        a += k
        
    return answer
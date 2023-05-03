def solution(num_list, n):
    a1 = num_list[:n]
    a2 = num_list[n:]
    a3 = a2 + a1
    return a3
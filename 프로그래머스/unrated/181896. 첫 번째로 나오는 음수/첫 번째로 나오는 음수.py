def solution(num_list):
    idx = 0
    for x in num_list:
        if (x < 0):
            return idx
        else:
            idx += 1
    return -1
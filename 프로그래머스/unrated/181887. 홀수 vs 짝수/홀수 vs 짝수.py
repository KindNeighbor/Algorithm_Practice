def solution(num_list):
    s1 = 0
    s2 = 0
    for i in range(len(num_list)):
        if i%2:
            s1 += num_list[i]
        else :
            s2 += num_list[i]
    return max(s1,s2)
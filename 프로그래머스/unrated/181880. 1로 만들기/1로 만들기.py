def solution(num_list):
    cnt = 0;
    for x in num_list:
        a = x
        while a > 1: 
            if a%2 == 0:
                a /= 2
                cnt += 1
            else:
                a -= 1
                a /= 2
                cnt += 1
    return cnt
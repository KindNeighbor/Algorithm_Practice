def solution(num_list):
    sum = 0
    if(len(num_list) >= 11):
        for x in num_list:
            sum += x
    else:
        sum += 1
        for x in num_list:
            sum *= x
    return sum
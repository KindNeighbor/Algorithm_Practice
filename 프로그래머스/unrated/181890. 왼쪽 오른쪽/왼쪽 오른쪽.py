def solution(str_list):
    a = -1
    b = -1
    c = []
    for i in range(len(str_list)):
        if str_list[i] == "l":
            a = i
            if a == 0:
                return c
            break;
        elif str_list[i] == "r":
            b = i
            if b == len(str_list) - 1:
                return c
            break;
            
    if a == -1 and b == -1:
        return c
    
    if a == -1 and b != -1:
        return str_list[b+1:]
    elif a != -1 and b == -1:
        return str_list[:a]

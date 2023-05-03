def solution(n_str):
    s = ""
    a = 0
    for i in range(len(n_str)):
        if n_str[0] != '0':
            break
        else: 
            if n_str[i] == '0':
                continue
            else : 
                a = i
                break
    if n_str[0] != '0': return n_str
    else : return n_str[i:]
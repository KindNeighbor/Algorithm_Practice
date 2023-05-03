def solution(str_list, ex):
    a = ""
    for s in str_list:
        if ex in s:
            continue
        else : a += s
    return a
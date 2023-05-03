def solution(my_string, indices):
    s = ""
    for i in range(len(my_string)):
        if i not in indices:
            s += my_string[i]
    return s
def solution(my_string):
    a = []
    my_string = my_string.split(" ")
    for s in my_string:
        if s != "":
            a.append(s)
    return a
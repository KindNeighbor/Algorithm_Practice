def solution(myString):
    a = []
    myString = myString.split("x")
    for s in myString:
        if s != "":
            a.append(s)
    return sorted(a)
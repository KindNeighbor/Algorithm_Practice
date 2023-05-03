def solution(myString):
    a = ""
    myString = myString.lower()
    for s in myString:
        if s == 'a':
            s = 'A'
            a += s
        else:
            a += s
    return a
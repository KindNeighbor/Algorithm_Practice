def solution(myString):
    a = ""
    for s in myString:
        if s < 'l':
            a+='l'
        else: a+=s
    return a
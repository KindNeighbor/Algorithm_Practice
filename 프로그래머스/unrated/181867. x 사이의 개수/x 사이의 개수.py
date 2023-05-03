def solution(myString):
    a = [i for i in myString.split('x')]
    b = []
    for x in a:
        b.append(len(x))
    return b
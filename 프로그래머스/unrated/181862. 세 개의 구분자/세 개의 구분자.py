def solution(myStr):
    myStr = myStr.replace('a'," ")
    myStr = myStr.replace('b'," ")
    myStr = myStr.replace('c'," ")
    a = [i for i in myStr.split(" ") if i]
    if len(a) == 0:
        return ["EMPTY"]
    return a
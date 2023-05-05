def solution(myString, pat):
    myString = myString.replace(pat, ".")
    s = ""
    b = 0
    for i in range(len(myString)-1, 0, -1):
        if myString[i] == ".":
            b = i
            break
    for i in range(0, b+1):
        s += myString[i]
    
    return s.replace(".",pat)

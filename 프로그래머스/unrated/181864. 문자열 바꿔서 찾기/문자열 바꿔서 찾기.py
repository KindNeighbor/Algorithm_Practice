def solution(myString, pat):
    s = ""
    for c in myString:
        if c == 'A':
            s += 'B'
        elif c == 'B':
            s += 'A'
    if pat in s: return 1
    else : return 0
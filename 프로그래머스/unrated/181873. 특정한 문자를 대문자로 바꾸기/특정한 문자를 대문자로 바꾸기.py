def solution(my_string, alp):
    ans = []
    for s in my_string:
        if s == alp:
            s = s.upper()
            ans.append(s)
        else: ans.append(s)
    return ''.join(ans)
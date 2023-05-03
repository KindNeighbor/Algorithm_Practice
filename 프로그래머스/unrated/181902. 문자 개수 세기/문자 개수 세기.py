def solution(my_string):
    ans = [0]*52
    for s in my_string:
        if s.isupper():
            ans[ord(s) - 65] += 1
        else: ans[ord(s) - 71] += 1
    
    return ans
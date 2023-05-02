def solution(rny_string):
    ss = ""
    for s in rny_string:
        if(s == "m"):
            s = s.replace("m", "rn")
        ss += s
    return ss
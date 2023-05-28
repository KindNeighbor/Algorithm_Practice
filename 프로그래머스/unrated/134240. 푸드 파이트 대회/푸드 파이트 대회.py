def solution(food):
    s = ""
    for i in range(1, len(food)):
        a = food[i] // 2
        for _ in range(a):
            s += str(i)
        
    return s + "0" + s[::-1]
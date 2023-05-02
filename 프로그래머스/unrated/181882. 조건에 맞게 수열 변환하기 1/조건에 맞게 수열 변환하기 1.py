def solution(arr):
    answer = []
    for x in arr:
        if x >= 50 and x % 2 == 0:
            x /= 2
            answer.append(x)
        elif x < 50 and x % 2 != 0:
            x *= 2
            answer.append(x)
        else: answer.append(x)
    return answer
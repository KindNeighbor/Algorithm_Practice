def solution(arr, k):
    answer = []
    if (k % 2 != 0):
        for x in arr:
            answer.append(x*k)
    else:
        for x in arr:
            answer.append(x+k)
        
    return answer
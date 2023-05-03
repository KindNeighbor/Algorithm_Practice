def solution(arr, intervals):
    a1 = arr[intervals[0][0]:intervals[0][1]+1]
    a2 = arr[intervals[1][0]:intervals[1][1]+1]
    a3 = a1 + a2
    return a3
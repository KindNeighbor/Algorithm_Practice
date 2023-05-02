def solution(numbers, n):
    sum = 0
    for x in numbers:
        sum += x
        if(sum > n):
            return sum
    return sum
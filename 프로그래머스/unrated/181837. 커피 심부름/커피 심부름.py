def solution(order):
    sum = 0
    for x in order:
        if "cafelatte" in x:
            sum += 5000
        elif "americano" in x:
            sum += 4500
        elif "anything" in x: 
            sum += 4500

    return sum
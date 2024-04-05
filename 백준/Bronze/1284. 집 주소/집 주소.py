while True:
    number = int(input())
    if number == 0:
        break
    width = 0
    number_str = str(number)
    for i in range(len(number_str)):
        if number_str[i] == '1':
            width += 2
        elif number_str[i] == '0':
            width += 4
        else:
            width += 3
        if i < len(number_str) - 1:
            width += 1
    width += 2
    print(width)
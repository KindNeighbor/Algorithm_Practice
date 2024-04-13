def Rev(num):
    str_num = str(num)
    reversed_str_num = str_num[::-1]
    reversed_num = int(reversed_str_num)
    return reversed_num

A, B = map(int, input().split(" "))

print(Rev(Rev(A) + Rev(B)))

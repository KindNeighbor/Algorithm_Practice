def decimal_to_base(N, B):
    digits = ""
    while N > 0:
        remainder = N % B
        if remainder >= 10:
            digits = chr(remainder - 10 + ord('A')) + digits
        else:
            digits = str(remainder) + digits
        N = N // B
    
    return digits

N, B = map(int, input().split())

output = decimal_to_base(N, B)
print(output)
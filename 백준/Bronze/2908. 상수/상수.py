a, b = input().split()

strA = a[::-1]
strB = b[::-1]

intA = int(strA)
intB = int(strB)

if intA > intB:
    print(intA)
else:
    print(intB)
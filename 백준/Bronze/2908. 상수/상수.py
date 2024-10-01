a, b = input().split()

listA = list(a)
listB = list(b)

listA.reverse()
listB.reverse()

strRa = ''.join(listA)
strRb = ''.join(listB)

intA = int(strRa)
intB = int(strRb)

if intA > intB:
    print(intA)
else:
    print(intB)
N = int(input())
numbers = list(map(int, input().split()))
fileSize = int(input())

sum = 0
for x in numbers:
    if x >= fileSize:
        mod = x // fileSize
        if x - fileSize * mod > 0:
            sum += fileSize * (mod + 1)
        else:
            sum += fileSize * mod
    elif x != 0 and x < fileSize:
        sum += fileSize
    else:
        continue

print(sum)





    


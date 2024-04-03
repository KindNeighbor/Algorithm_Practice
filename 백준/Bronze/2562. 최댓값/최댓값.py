numbers = [int(input()) for _ in range(9)]

maxValue = numbers[0]
maxIdx = 1

for i in range(1, 9):
    if numbers[i] > maxValue:
        maxValue = numbers[i]
        maxIdx = i + 1

print(maxValue)
print(maxIdx)
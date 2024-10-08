list1 = [1, 1, 2, 2, 2, 8]

list2 = list(map(int, input().split()))

list3 = [0] * 6

for i in range(len(list1)):
    list3[i] = list1[i] - list2[i]

print(*list3)
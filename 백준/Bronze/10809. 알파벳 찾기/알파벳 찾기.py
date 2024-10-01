S = input()

list1 = [-1] * 26

for i in range(len(S)):
    if list1[ord(S[i]) - 97] == -1:
        list1[ord(S[i]) - 97] = i

print(*list1)
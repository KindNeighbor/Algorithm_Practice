while True:
    A,B,C = input().split(" ")
    if A == '#':
        break;
    if int(B) > 17 or int(C) >= 80:
        print(A, "Senior", sep=" ")
    else:
        print(A, "Junior", sep=" ")
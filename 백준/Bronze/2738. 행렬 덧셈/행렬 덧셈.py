N, M = map(int, input().split())

A = [[0 for _ in range(M)] for _ in range(N)]
B = [[0 for _ in range(M)] for _ in range(N)]

for i in range(N):
    list1 = list(map(int, input().split()))
    for j in range(len(list1)):
        A[i][j] = list1[j]

for i in range(N):
    list2 = list(map(int, input().split()))
    for j in range(len(list1)):
        B[i][j] = list2[j]
        
sum = [[A[i][j] + B[i][j] for j in range(M)] for i in range(N)]

for row in sum:
    print(' '.join(map(str, row)))
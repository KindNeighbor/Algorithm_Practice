def solution(rank, attendance):
    a = []
    idx = 1
    for i in range(len(rank)):
        for j in range(len(rank)):
                if rank[j] == idx and attendance[j]:
                    a.append(j)
                    idx += 1
                    break
                elif rank[j] == idx and not attendance[j]:
                    idx += 1

    return 10000*a[0] + 100*a[1] + a[2]
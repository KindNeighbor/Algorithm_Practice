def solve(N, M, A, B):
    boxes = A.copy()
    wasted = 0 
    box_idx = 0 
    
    for book in B:
        while box_idx < N and book > boxes[box_idx]:
            wasted += boxes[box_idx]
            box_idx += 1

        boxes[box_idx] -= book

    for i in range(box_idx, N):
        wasted += boxes[i]
        
    return wasted

N, M = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

print(solve(N, M, A, B))
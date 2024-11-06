N,M = map(int, input().split())

board = []
for _ in range(N):
    row = [True if x == 'B' else False for x in input().strip()]
    board.append(row)
    
cut_N = N - 7
cut_M = M - 7

def sol(a, b, arr):
    end_a = a + 8
    end_b = b + 8
    cnt = 0
    
    bw = arr[a][b]
    
    for i in range(a, end_a):
        for j in range(b, end_b):
            if arr[i][j] != bw:
                cnt += 1
            bw = not bw
        bw = not bw
    
    cnt = min(cnt, 64 - cnt)
    return cnt

min_cnt = 64
for i in range(cut_N):
    for j in range(cut_M):
        min_cnt = min(min_cnt, sol(i, j, board))
        
print(min_cnt)
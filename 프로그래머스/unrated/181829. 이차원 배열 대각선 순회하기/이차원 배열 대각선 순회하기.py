def solution(board, k):
    sum = 0
    for i in range(len(board)):
        for j in range(len(board[0])):
            if i+j<=k:
                sum += board[i][j]
    return sum
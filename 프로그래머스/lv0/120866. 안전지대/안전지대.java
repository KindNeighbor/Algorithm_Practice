import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int[][] copyBoard = new int[board.length][board[0].length];

        int tempIndex = 0;
        for (int[] rows : board) {
            copyBoard[tempIndex] = Arrays.copyOf(rows, board[tempIndex].length);
            tempIndex++;
        }

        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        if (k < 0 || k >= copyBoard.length) continue;
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (l < 0 || l >= copyBoard[0].length) continue;
                            copyBoard[k][l] = 1;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < copyBoard.length; i++) {
            for (int j = 0; j < copyBoard[i].length; j++) {
                if (copyBoard[i][j] == 1) {
                    cnt++;
                }
            }
        }

        return board.length * board[0].length - cnt;
    }
}
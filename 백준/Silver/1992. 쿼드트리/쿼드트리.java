import java.io.*;
import java.util.*;

public class Main {

    static int[][] board;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }

        sol(0, 0, N);
        System.out.println(sb);
    }

    public static void sol(int row, int col, int size) {

        if (numberCheck(row, col, size)) {
            sb.append(board[row][col]);
            return;
        }

        int newBoard = size / 2;

        sb.append("(");

        sol(row, col, newBoard);
        sol(row, col + newBoard, newBoard);
        sol(row + newBoard, col, newBoard);
        sol(row + newBoard, col + newBoard, newBoard);

        sb.append(")");
    }

    public static boolean numberCheck(int row, int col, int size) {
        int val = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }
}
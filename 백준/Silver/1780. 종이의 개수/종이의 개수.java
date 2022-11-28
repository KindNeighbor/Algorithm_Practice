import java.io.*;
import java.util.*;

public class Main {

    static int[][] board;

    static int Gray, White, Black;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sol(0, 0, N);
        System.out.println(Gray);
        System.out.println(White);
        System.out.println(Black);
    }

    public static void sol(int row, int col, int size) {

        if (colorCheck(row, col, size)) {
            if (board[row][col] == -1) {
                Gray++;
            } else if (board[row][col] == 0) {
                White++;
            } else {
                Black++;
            }
            return;
        }

        int newBoard = size / 3;

        sol(row, col, newBoard);
        sol(row, col + newBoard, newBoard);
        sol(row, col + 2 * newBoard, newBoard);

        sol(row + newBoard, col, newBoard);
        sol(row + newBoard, col + newBoard, newBoard);
        sol(row + newBoard, col + 2 * newBoard, newBoard);

        sol(row + 2 * newBoard, col, newBoard);
        sol(row + 2 * newBoard, col + newBoard, newBoard);
        sol(row + 2 * newBoard, col + 2 * newBoard, newBoard);

    }

    public static boolean colorCheck(int row, int col, int size) {
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
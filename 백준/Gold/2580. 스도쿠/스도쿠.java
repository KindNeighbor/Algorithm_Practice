import java.io.*;
import java.util.*;


public class Main {

    static int[][] map = new int[9][9];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solveSudoku(0, 0);
    }

    public static void solveSudoku(int row, int col) {
        if (col == 9) {
            solveSudoku(row + 1, 0);
            return;
        }

        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if (map[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (checkNumber(row, col, i)) {
                    map[row][col] = i;
                    solveSudoku(row, col + 1);
                }
            }
            map[row][col] = 0;
            return;
        }

        solveSudoku(row, col + 1);
    }

    public static boolean checkNumber(int row, int col, int val) {
        for (int i = 0; i < 9; i++) {
            if (map[row][i] == val) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (map[i][col] == val) {
                return false;
            }
        }

        int newRow = (row / 3) * 3;
        int newCol = (col / 3) * 3;

        for (int i = newRow; i < newRow + 3; i++) {
            for (int j = newCol; j < newCol + 3; j++) {
                if (map[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }
}
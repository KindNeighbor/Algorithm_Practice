import java.io.*;

public class Main {

    static int N;
    static int cnt;
    static int[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N];
        System.out.println(nQueen(0));
    }

    public static int nQueen(int row) {
        if (row == N) {
            cnt++;
            return cnt;
        }

        for (int i = 0; i < N; i++) {
            board[row] = i;

            if (isPromising(row)) {
                nQueen(row + 1);
            }
        }

        return cnt;
    }

    public static boolean isPromising(int row) {
        for (int i = 0; i < row; i++) {
            if (board[row] == board[i] || row - i == Math.abs(board[row] - board[i])) {
                return false;
            }
        }
        return true;
    }
}
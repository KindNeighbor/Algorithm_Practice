import java.io.*;
import java.util.*;

public class Main {

    static int[][] board;
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        int ans = Math.min(getNewBoard('W'), getNewBoard('B'));
        System.out.println(ans);

    }

    public static int getNewBoard(char color) {
        int val;
        int cnt = Integer.MAX_VALUE;
        int[][] sum = new int[N + 1][M + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] == color) {
                        val = 0;
                    } else {
                        val = 1;
                    }
                } else {
                    if (board[i][j] == color) {
                        val = 1;
                    } else {
                        val = 0;
                    }
                }
                sum[i + 1][j + 1] = val + sum[i][j + 1] + sum[i + 1][j] - sum[i][j];
            }
        }

        for (int i = 1; i <= N - K + 1; i++) {
            for (int j = 1; j <= M - K + 1; j++) {
                cnt = Math.min(cnt, sum[i + K -1][j + K - 1] - sum[i + K -1][j - 1] - sum[i - 1][j + K - 1] + sum[i - 1][j - 1]);
            }
        }

        return cnt;
    }
}
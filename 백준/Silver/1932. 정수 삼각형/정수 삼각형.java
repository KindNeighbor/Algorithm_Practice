import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];
        int[][] dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];
        for (int i = 1; i < N; i++) {
            dp[i][0] = dp[i-1][0] + arr[i][0];

            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j]) + arr[i][j];
            }

            dp[i][i] = dp[i-1][i-1] + arr[i][i];
        }

        Arrays.sort(dp[N-1]);
        System.out.println(dp[N-1][N-1]);
    }
}
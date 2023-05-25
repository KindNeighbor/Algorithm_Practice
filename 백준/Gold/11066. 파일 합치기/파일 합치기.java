import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int[] sum = new int[K+1];
            int[][] dp = new int[K+1][K+1];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= K; j++) {
                sum[j] = sum[j-1] + Integer.parseInt(st.nextToken());
            }
            
            for (int a = 1; a < K; a++) {
                for (int start = 1; start + a <= K; start++) {
                    int end = start + a;
                    dp[start][end] = Integer.MAX_VALUE;
                    for (int mid = start; mid < end; mid++) {
                        dp[start][end] 
                            = Math.min(dp[start][mid] + dp[mid+1][end] + 
                                       sum[end] - sum[start-1], dp[start][end]);
                    }
                }
            }
            System.out.println(dp[1][K]);
        }
    }
}
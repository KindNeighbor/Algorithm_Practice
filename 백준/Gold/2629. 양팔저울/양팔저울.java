import java.io.*;
import java.util.*;

public class Main {
	static int N, M; 
    static int a, max = 15000; 
    static int[] arr;
	static boolean dp[][];
	
	public static void main(String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		dp = new boolean[31][max+1];
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        dp(0, 0);
        
        StringBuilder sb = new StringBuilder();
        
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            a = Integer.parseInt(st.nextToken());
            if (a > 15000) sb.append("N").append(" ");
            else if (dp[N][a]) sb.append("Y").append(" ");
            else if (!dp[N][a]) sb.append("N").append(" ");
        }
        System.out.println(sb);
	}
	
	public static void dp(int idx, int weight) {
		if (dp[idx][weight]) return;
        dp[idx][weight] = true;
        
        if (idx == N) return;
        
        dp(idx + 1, weight + arr[idx+1]);
        dp(idx + 1, weight);
        dp(idx + 1, Math.abs(weight - arr[idx+1]));
	}
}
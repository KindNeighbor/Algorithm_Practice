import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger[] dp = new BigInteger[N+1];
        
        dp[0] = BigInteger.valueOf(0);

        if (N == 0) {
            System.out.println(0);
            return;
        }

        dp[1] = BigInteger.valueOf(1);

        if (N == 1) {
            System.out.println(1);
            return;
        }
        
        for (int i = 2; i <= N; i++) {
            BigInteger add = dp[i-1].add(dp[i-2]);
            dp[i] = add;
        }
        
        System.out.println(dp[N]);
    }
}

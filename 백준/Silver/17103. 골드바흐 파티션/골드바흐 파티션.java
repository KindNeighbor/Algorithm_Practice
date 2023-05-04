import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        boolean[] prime = new boolean[1000001];
        prime[0] = prime[1] = true;
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == false) {
                for (int j = 2; i*j < prime.length; j++) {
                    prime[i*j] = true;
                }
            }
        }
        
        for (int i = 0; i < T; i++) {
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());
            for (int j = 2; j <= n/2; j++) {
                if (prime[j] == false) {
                    if (prime[n - j] == false) {
                           cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
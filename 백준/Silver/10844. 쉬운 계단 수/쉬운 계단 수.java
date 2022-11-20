import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[][] a = new long[N+1][10];

        a[1][0] = 0;
        for(int i = 1; i < 10; i++) {
            a[1][i] = 1;
        }

        for(int i = 2; i<= N; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == 0) {
                    a[i][j] = a[i-1][j+1] % 1_000_000_000;
                }
                else if(j == 9) {
                    a[i][j] = a[i-1][j-1] % 1_000_000_000;
                }
                else {
                    a[i][j] = (a[i-1][j+1] + a[i-1][j-1]) % 1_000_000_000;
                }
            }
        }

        long ans = 0;
        for(int i = 0; i < 10; i++) {
            ans += a[N][i];
        }

        System.out.println(ans % 1_000_000_000);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean prime[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        prime = new boolean[246913];
        getPrime();

        while(true) {

            int N = Integer.parseInt(br.readLine());
            if(N == 0) { break;}
            int count = 0;

            for (int i = N + 1; i <= 2 * N; i++) {
                if (prime[i] == false) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void getPrime() {
        prime[0] = true;
        prime[1] = true;

        for(int i = 0; i<Math.sqrt(prime.length); i++) {
            if(prime[i] == true) {
                continue;
            }
            for(int j = i*i; j<prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}

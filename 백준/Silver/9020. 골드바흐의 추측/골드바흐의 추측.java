import java.io.*;

public class Main {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        get_prime();

        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int a = n / 2;
            int b = n / 2;
            while(true) {
                if(prime[a] == false && prime[b] == false) {
                    System.out.println(a + " " + b);
                    break;
                }
                a--;
                b++;
            }
        }
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
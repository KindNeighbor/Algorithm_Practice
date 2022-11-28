import java.io.*;
import java.util.*;

public class Main {

    static long NUM = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long N = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long numerator = factorial(N);
        long denominator = factorial(K) * factorial(N - K) % NUM;

        long ans = numerator * Calculate(denominator, NUM - 2) % NUM;

        System.out.println(ans);

    }

    public static long Calculate(long a, long num) {
        if (num == 1) {
            return a % NUM;
        }

        long val = Calculate(a, num / 2);

        if (num % 2 != 0) {
            return (val * val % NUM) * a % NUM;
        }

        return val * val % NUM;
    }

    public static long factorial(long N) {
        long b = 1;

        while (N > 1) {
            b = (b * N) % NUM;
            N--;
        }

        return b;
    }
}
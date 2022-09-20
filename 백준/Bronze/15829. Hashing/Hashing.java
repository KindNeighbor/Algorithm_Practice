import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long a = 1;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (s.charAt(i) - 96) * a;
            a = (a * 31) % 1234567891;
        }

        System.out.println(sum % 1234567891);
    }
}
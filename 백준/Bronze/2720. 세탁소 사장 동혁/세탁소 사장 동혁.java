import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            while (a > 0) {
                if (a >= 25) {
                    b = a / 25;
                    a = a - 25 * b;
                }

                if (a >= 10) {
                    c = a / 10;
                    a = a - 10 * c;
                }

                if (a >= 5) {
                    d = a / 5;
                    a = a - 5 * d;
                }

                if (a >= 1) {
                    e = a;
                    a = a - e;
                }
                
                System.out.println(b + " " + c + " " + d + " " + e);
            }
        }
    }
}
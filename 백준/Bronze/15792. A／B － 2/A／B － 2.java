import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(a / b);
        a %= b;
        if (a != 0) {
            sb.append(".");
            for (int i = 0; i <= 1000; i++) {

                if (a == 0) {
                    break;
                }

                while (a < b) {
                    a *= 10;
                    if (a < b) {
                        sb.append(0);
                    }
                }

                int c = a / b;
                a %= b;
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int a = 0, b = 0, c = 0;

        if (T > 300) {
            a = T / 300;
            T = T - 300 * a;
        }

        if (T >= 60) {
            b = T / 60;
            T = T - 60 * b;
        }

        if (T % 10 != 0) {
            System.out.println(-1);
            return;
        } else {
            c = T / 10;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
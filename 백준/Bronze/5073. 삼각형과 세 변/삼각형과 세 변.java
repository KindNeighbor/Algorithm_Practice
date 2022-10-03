import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                return;
            }

            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;
            if (sum - max > max ) {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) {
                    System.out.println("Isosceles");
                } else if (a != b && b != c) {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

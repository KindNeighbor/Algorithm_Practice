import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i = 0;
        while (true) {
            i++;
            st = new StringTokenizer(br.readLine(), " ");
            double  a = Double.parseDouble(st.nextToken());
            double  b = Double.parseDouble(st.nextToken());
            double  c = Double.parseDouble(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a == -1) {
                if (b < c) {
                    double a1 = Math.sqrt(c * c - b * b);
                    System.out.println("Triangle #" + i);
                    System.out.printf("a = %.03f \n", a1);
                    System.out.println();
                } else {
                    System.out.println("Triangle #" + i);
                    System.out.println("Impossible.");
                    System.out.println();
                }
            } else if (b == -1) {
                if (a < c) {
                    double b1 = Math.sqrt(c * c - a * a);
                    System.out.println("Triangle #" + i);
                    System.out.printf("b = %.03f \n", b1);
                    System.out.println();
                } else {
                    System.out.println("Triangle #" + i);
                    System.out.println("Impossible.");
                    System.out.println();
                }
            } else if (c == -1) {
                double c1 = Math.sqrt(a * a + b * b);
                System.out.println("Triangle #" + i);
                System.out.printf("c = %.03f \n", c1);
                System.out.println();
            } else if (a == 0 || b == 0 || c == 0) {
                System.out.println("Triangle #" + i);
                System.out.println("Impossible.");
                System.out.println();
            }
        }
    }
}
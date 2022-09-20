import java.io.*;
import java.util.*;

public class Main {

    public static int[][][] arr3 = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append("\n");
        }
        System.out.println(sb);
    }

    public static int w(int a, int b, int c) {

        if ((a >= 0 && b >= 0 && c >= 0) && (a <= 20 && b <= 20 && c <= 20)
                && (arr3[a][b][c] != 0)) {
           return arr3[a][b][c];

        } else if (a <= 0 || b <= 0 || c <= 0) {
            return 1;

        } else if (a > 20 || b > 20 || c > 20) {
            return arr3[20][20][20] = w(20, 20, 20);

        } else if (a < b && b < c) {
            return arr3[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);

        } else {
            return arr3[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
    }
}
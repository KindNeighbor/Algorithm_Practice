import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int D1 = Integer.parseInt(st.nextToken());
        int D2 = Integer.parseInt(st.nextToken());
        if (D1 == D2) {
            System.out.println(K*K);
        } else {
            double a = (double) (D1 - D2) / 2;
            double b = K * K - a * a;
            System.out.println(b);
        }
    }
}
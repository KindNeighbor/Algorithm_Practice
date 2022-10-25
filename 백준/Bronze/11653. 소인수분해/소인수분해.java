import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int idx = 2;
        while (N > 1) {
            while (true) {
                if (N % idx == 0) {
                    N /= idx;
                    sb.append(idx).append("\n");
                } else {
                    break;
                }
            }
            idx++;
        }

        System.out.println(sb);
    }
}
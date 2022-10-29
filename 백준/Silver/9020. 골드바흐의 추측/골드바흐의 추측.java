import java.io.*;


public class Main {

    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        findPrime();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            int a = N / 2;
            int b = N / 2;

            while (true) {
                if (!check[a] && !check[b]) {
                    sb.append(a).append(" ").append(b);
                    break;
                }
                a--; b++;
            }

            System.out.println(sb);
        }
    }

    public static void findPrime() {
        check = new boolean[10001];
        check[0] = true;
        check[1] = true;

        for (int i = 2; i <= Math.sqrt(check.length); i++) {
            if (check[i]) continue;
            for (int j = i*i; j < check.length; j += i) {
                check[j] = true;
            }
        }
    }
}
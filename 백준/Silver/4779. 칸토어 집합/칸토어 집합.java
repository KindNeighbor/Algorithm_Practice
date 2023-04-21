import java.io.*;

public class Main {

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = br.readLine()) != null) {
            sb = new StringBuilder();
            int n = Integer.parseInt(s);

            int num = 1;
            for (int i = 0; i < n; i++) {
                num *= 3;
            }

            for (int i = 0; i < num; i++) {
                sb.append('-');
            }

            recursion(1, num);
            System.out.println(sb.toString());
        }
    }

    public static void recursion(int a, int b) {
        if (a == b) {
            return;
        }

        if (sb.charAt((b + a) / 2 - 1) == ' ') {
            return;
        }

        int c = (b - a + 1) / 3;

        for (int i = ((a + b) / 2) - ((c - 1) / 2) - 1; i < ((a + b) / 2) + ((c - 1) / 2); i++) {
            sb.setCharAt(i, ' ');
        }

        int d = ((a + b) / 2) - ((c - 1) / 2) - 1;
        int e = ((a + b) / 2) + ((c - 1) / 2) + 1;

        recursion(a, d);
        recursion(e, b);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int n = 0;
        int pre_n = 0;
        int idx = 1;
        int cnt = 0;
        while (n <= X) {
            pre_n = n;
            int num = ((idx * (idx - 1)) / 2) + 1;
            n = num;
            idx++;
            cnt++;
        }

        int a = 0;
        int b = 0;

        if (cnt % 2 == 0) {
            a = cnt - 1;
            b = 1;
        } else if (cnt % 2 != 0) {
            a = 1;
            b = cnt - 1;
        }

        int length = X - pre_n;

        if (a > b) {
            for (int i = 0; i < length; i++) {
                a--;
                b++;
            }
        } else {
            for (int i = 0; i < length; i++) {
                a++;
                b--;
            }
        }

        System.out.println(a + "/" + b);
    }
}

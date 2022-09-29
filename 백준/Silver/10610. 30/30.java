import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        char[] c = s1.toCharArray();
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;
        int sum = 0;

        for (int i = 0; i < c.length; i++) {
            sum += (c[i] - '0');
            if (c[i] - '0' == 0) {
                check1 = true;
            }
        }

        if (sum % 3 == 0) {
            check2 = true;
        }

        if (check1 && check2) {
            check3 = true;
        }
        if (!check3) {
            System.out.println(-1);
        } else {
            Arrays.sort(c);
            String s2 = "";
            for (int i = c.length - 1; i >= 0; i--) {
                s2 += c[i];
            }
            System.out.println(s2);
        }

    }
}

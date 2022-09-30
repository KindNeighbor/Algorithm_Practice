import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();
        int cnt0 = 0;
        int cnt1 = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] != c[i+1] && c[i] == '0') {
                cnt0++;
            } else if (c[i] != c[i+1] && c[i] == '1') {
                cnt1++;
            }
        }
        if (cnt0 == 0 || cnt1 == 0) {
            System.out.println(Math.max(cnt0, cnt1));
        } else if (Math.abs(cnt0 - cnt1) == 1) {
            System.out.println(Math.max(cnt0, cnt1));
        } else {
            System.out.println(Math.min(cnt0, cnt1));
        }
    }
}

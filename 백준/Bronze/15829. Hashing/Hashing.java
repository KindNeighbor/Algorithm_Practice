import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long sum = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            sum += ((long)(c[i] - 'a') + 1) * Math.pow(31, i);
        }

        System.out.println(sum);
    }
}
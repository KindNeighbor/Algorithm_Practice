import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int newN = (N / 100) * 100;

        while (true) {
            if (newN % F == 0) {
                String s = String.valueOf(newN);
                s = s.substring(s.length() - 2);
                System.out.println(s);
                return;
            }
            newN++;
        }
    }
}

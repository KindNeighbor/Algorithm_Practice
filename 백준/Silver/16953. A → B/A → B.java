import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        int cnt = 0;

        while (b != a) {

            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 2 != 0 && b % 10 > 2){
                System.out.println(-1);
                return;
            } else {
                b /= 10;
            }
            cnt++;
            if (b == 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(cnt+1);
    }
}

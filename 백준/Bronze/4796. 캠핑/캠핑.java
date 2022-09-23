import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if (L == 0 && P == 0 && V == 0) {
                break;
            }

            int a = V / P;
            int b = V - a * P;
            int ans = L * a;
            if (b >= L) {
                ans += L;
            } else {
                ans += b;
            }
            
            System.out.println("Case " + cnt + ": " + ans);
            cnt++;
        }

    }
}
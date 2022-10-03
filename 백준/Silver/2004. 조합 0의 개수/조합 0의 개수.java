import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count5 = find5(N) - find5(N-M) - find5(M);
        int count2 = find2(N) - find2(N-M) - find2(M);

        int ans = Math.min(count2, count5);

        System.out.println(ans);

    }

    public static int find5(int x) {
        int cnt = 0;
        while (x > 0) {
            cnt = cnt + x/5;
            x /= 5;
        }
        return cnt;
    }

    public static int find2(int x) {
        int cnt = 0;
        while (x > 0) {
            cnt = cnt + x/2;
            x /= 2;
        }
        return cnt;
    }
}

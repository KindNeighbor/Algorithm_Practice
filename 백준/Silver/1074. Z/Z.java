import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int N_pow = (int)Math.pow(2, N);
        int ans = sol(N_pow, r, c);
        System.out.println(ans-1);
    }

    public static int sol(int N, int r, int c) {
        return recursion(0, N, r, c);
    }

    public static int recursion(int count, int N, int r, int c) {
        if (N == 2) {
            if (r == 0 && c == 0) {
                return count + 1;
            } else if (r == 0 && c == 1) {
                return count + 2;
            } else if (r == 1 && c == 0) {
                return count + 3;
            } else {
                return count + 4;
            }
        }

        int m = N/2;
        if (r < m && c < m) {
            return recursion(count, m, r, c);
        } else if (r < m && c >= m) {
            count += m * m;
            return recursion(count, m, r, c - m);
        } else if (r >= m && c < m) {
            count += m * m * 2;
            return recursion(count, m, r - m, c );
        } else {
            count += m * m * 3;
            return recursion(count, m, r - m, c - m);
        }
    }
}

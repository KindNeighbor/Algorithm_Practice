import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        
        long l = 0;
        long r = a;
        long ans = 0;
        while (l < r) {
            long mid = (l >> 1) + (r >> 1);
            if (a <= Math.pow(mid, 2)) {
                ans = mid;
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        if (a <= 2) {
            System.out.println(a);
        } else {
            System.out.println(ans);
        }
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int distance = b - a;
            int longest = (int)Math.sqrt(distance);

            if (longest == Math.sqrt(distance)) {
                System.out.println(longest * 2 - 1);
            } else if (distance <= longest * longest + longest) {
                System.out.println(longest * 2);
            } else {
                System.out.println(longest * 2 + 1);
            }
        }
    }
}

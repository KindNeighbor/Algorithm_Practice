import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int a = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int j = 0; j < a; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                boolean innerCircle1 = false;
                boolean innerCircle2 = false;

                if (r * r > Math.pow((x1 - cx), 2) + Math.pow((y1 - cy), 2)) {
                    innerCircle1 = true;
                }

                if (r * r > Math.pow((x2 - cx), 2) + Math.pow((y2 - cy), 2)) {
                    innerCircle2 = true;
                }

                if (innerCircle1 == true && innerCircle2 == false) {
                    cnt++;
                } else if (innerCircle1 == false && innerCircle2 == true) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
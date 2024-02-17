import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        
        if ((M - m) < T) {
            System.out.println("-1");
            return;
        }
        
        int X = m;
        int time = 0;
        int exTime = 0;
        while (true) {
            if (X + T > M) {
                X -= R;
                if (X < m) {
                    X = m;
                }
            } else {
                X += T;
                exTime++;
            }
            time++;
            if (exTime == N) {
                break;
            }
        }
        System.out.println(time);
    }
}
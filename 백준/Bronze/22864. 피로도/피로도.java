import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        if (A > M) {
                    System.out.println(0);
                    return;
                }

        int work = 0;
        int tired = 0;
        for (int i = 0; i < 24; i++) {
            if (M - tired >= A) {
                work += B;
                tired += A;
            } else {
                tired -= C;
                if (tired < 0) {
                    tired = 0;
                }
            }
        }
        System.out.println(work);
    }
}
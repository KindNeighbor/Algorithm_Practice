import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long T = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            long max = 0;
            for (int j = 0; j < 3; j++) {
                long a = Long.parseLong(st.nextToken());
                sum += a;
                max = Math.max(max, a);
            }

            sb.append(max*max + (sum-max)*(sum-max)).append("\n");
        }
        System.out.println(sb);
    }
}
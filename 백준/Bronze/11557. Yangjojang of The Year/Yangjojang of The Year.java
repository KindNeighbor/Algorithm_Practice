import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(br.readLine());
            String[] s_arr = new String[a];
            int[] arr = new int[a];
            int idx = 0;
            int max = 0;
            for (int j = 0; j < a; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                s_arr[j] = st.nextToken();
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int k = 0; k < a; k++) {
                if (arr[k] >= max) {
                    max = arr[k];
                    idx = k;
                }
            }
            System.out.println(s_arr[idx]);
        }
    }
}
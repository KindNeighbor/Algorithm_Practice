import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
        int[] a = new int[8];
        for (int i = 0; i < 8; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int cnt_a = 0;
        int cnt_d = 0;
        int cnt_m = 0;
        for (int i = 0; i < 7; i++) {
            if ((a[i] - a[i+1]) == -1) {
                cnt_a++;
            } else if ((a[i] - a[i+1]) == 1) {
                cnt_d++;
            } else {
                cnt_m++;
            }
        }
        if(cnt_a == 7) {
            System.out.println("ascending");
        } else if (cnt_d == 7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}

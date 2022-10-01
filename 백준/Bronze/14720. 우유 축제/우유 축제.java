
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == idx && cnt == 0) {
                cnt++;
                idx = 1;
            } else if (arr[i] == 1 && idx == 1 && cnt > 0) {
                cnt++;
                idx = 2;
            } else if (arr[i] == 2 && idx == 2 && cnt > 0) {
                cnt++;
                idx = 0;
            } else if (arr[i] == idx && idx == 0 && cnt > 0) {
                cnt++;
                idx = 1;
            }
        }

        System.out.println(cnt);
    }
}
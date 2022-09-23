import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[102];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        for (int i = 4; i < 102; i++) {
            arr[i] = (arr[i-2] + arr[i-3]);
        }

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            System.out.println(arr[a]);
        }
    }
}
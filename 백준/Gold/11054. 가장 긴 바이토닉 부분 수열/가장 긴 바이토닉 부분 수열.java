import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dpL = new int[N + 1];

        for (int i = 0; i < N; i++) {
            dpL[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dpL[i] < dpL[j] + 1) {
                    dpL[i] = dpL[j] + 1;
                }
            }
        }

        int[] dpR = new int[N + 1];

        for (int i = N - 1; i >= 0; i--) {
            dpR[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (arr[j] < arr[i] && dpR[i] < dpR[j] + 1) {
                    dpR[i] = dpR[j] + 1;
                }
            }
        }

        int max = -1;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dpL[i] + dpR[i]);
        }

        System.out.println(max - 1);
    }
}
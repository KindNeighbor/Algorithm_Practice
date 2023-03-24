import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            int l = 0;
            int r = N - 1;

            while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum == arr[i]) {
                    if (i == l) l++;
                    else if (i == r) r--;
                    else {
                        cnt++;
                        break;
                    }
                } else if (sum < arr[i]) l++;
                else r--;
            }
        }
        System.out.println(cnt);
    }
}
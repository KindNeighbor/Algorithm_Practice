import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] nums = new int[N + 1];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int total = 0;

        while (left <= N && right <= N) {
            if (total >= S && min > right - left) {
                min = right - left;
            }

            if (total < S) {
                total += nums[right++];
            } else {
                total -= nums[left++];
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("0");
        } else {
            System.out.println(min);
        }
    }
}

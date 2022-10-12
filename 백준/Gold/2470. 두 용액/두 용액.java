import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);
        long[] arr1 = new long[2];
        int l = 0;
        int r = N - 1;
        long minDiff = Integer.MAX_VALUE;
        while (l < r) {
            long mid = arr[l] + arr[r];

            if (Math.abs(mid) < Math.abs(minDiff)) {
                minDiff = mid;
                arr1[0] = arr[l];
                arr1[1] = arr[r];
            }

            if (mid > 0) {
                r--;
            } else {
                l++;
            }
        }
        System.out.println(arr1[0] + " " + arr1[1]);
    }
}
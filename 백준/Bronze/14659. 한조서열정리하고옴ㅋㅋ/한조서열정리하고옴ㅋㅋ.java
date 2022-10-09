import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] cntArr = new int[N];
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = i; j < N; j++) {
                if (arr[i] >= arr[j]) {
                    cnt++;
                }

                if (arr[i] < arr[j]) {
                    break;
                }
            }
            cntArr[i] = cnt - 1;
        }
        Arrays.sort(cntArr);
        System.out.println(cntArr[cntArr.length - 1]);
    }
}
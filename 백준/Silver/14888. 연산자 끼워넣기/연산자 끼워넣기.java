import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] number;
    static int[] arr;

    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        number = new int[N];
        arr = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            number[i] = a;
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            int b = Integer.parseInt(st.nextToken());
            arr[i] = b;
        }

        dfs(number[0],1);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int num, int idx) {
        if (idx == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        for (int i = 0; i < 4; i++) {
            if (arr[i] > 0) {
                arr[i]--;

                switch (i) {

                    case 0 :
                        dfs(num + number[idx], idx + 1);
                        break;
                    case 1 :
                        dfs(num - number[idx], idx + 1);
                        break;
                    case 2 :
                        dfs(num * number[idx], idx + 1);
                        break;
                    case 3 :
                        dfs(num / number[idx], idx + 1);
                        break;
                }
                arr[i]++;
            }
        }
    }
}
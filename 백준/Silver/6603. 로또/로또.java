import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());

            if (N == 0) {
                break;
            }

            check = new boolean[N];
            arr = new int[N];

            for (int i = 0; i < N; i++) {
                int b = Integer.parseInt(st.nextToken());
                arr[i] = b;
            }

            dfs(0,0);
            System.out.println();
        }
    }

    public static void dfs(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < N; i++) {
                if (check[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        for (int i = start; i < N; i++) {
            check[i] = true;
            dfs(depth + 1, i + 1);
            check[i] = false;
        }
    }
}
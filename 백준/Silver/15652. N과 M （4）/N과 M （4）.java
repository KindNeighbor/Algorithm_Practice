import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr;
    public static boolean[] visited;
    public static int N,M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N];

        dfs(1, 0);
        System.out.println(sb);

    }

    public static void dfs(int x, int y) {
        if(y == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = x; i <= N; i++) {
            arr[y] = i;
            dfs(i, y + 1);
        }
    }
}
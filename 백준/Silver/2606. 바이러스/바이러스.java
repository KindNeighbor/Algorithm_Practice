import java.util.*;
import java.io.*;

public class Main {

    public static int N, M, R;
    public static int count = 0;
    public static int[][] a;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        a = new int[N+1][N+1];
        visited = new boolean[N + 1];

        StringTokenizer st;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a[u][v] = a[v][u] = 1;

        }

        dfs(1);

        System.out.println(count);

    }

    private static void dfs(int x) {
        visited[x] = true;
        for (int i = 0; i <= N; i++) {
            if(a[x][i] == 1 && visited[i] == false) {
                count++;
                dfs(i);
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr;
    public static boolean[] visited;
    public static int a,b;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        arr = new int[b];
        visited = new boolean[a];

        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int x) {
        if(x == b) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < a; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[x] = i + 1;
                dfs(x + 1);
                visited[i] = false;
            }
        }
    }
}
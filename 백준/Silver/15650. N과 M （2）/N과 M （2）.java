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

        dfs(1,0);
        System.out.println(sb);

    }

    public static void dfs(int x, int y) {
        if(y == b) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = x; i <= a; i++) {
                arr[y] = i;
                dfs(i + 1, y + 1);
        }
    }
}
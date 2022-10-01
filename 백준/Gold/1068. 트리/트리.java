
import java.io.*;
import java.util.*;

public class Main {

    static int[] parent;
    static boolean[] visited;
    static int N;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        parent = new int[N];
        int root = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            parent[i] = Integer.parseInt(st.nextToken());
            if (parent[i] == -1) {
                root = i;
            }
        }
        int delete_x = Integer.parseInt(br.readLine());
        deleteNode(delete_x);

        cnt = 0;
        visited = new boolean[N];
        dfs(root);

        System.out.println(cnt);

    }

    public static void deleteNode(int x) {
        parent[x] = -5;
        for (int i = 0; i < N; i++) {
            if (parent[i] == x) {
                deleteNode(i);
            }
        }
    }

    public static void dfs(int x) {
        boolean check = true;
        visited[x] = true;
        if (parent[x] != -5) {
            for (int i = 0; i < N; i++) {
                if (parent[i] == x && !visited[i]) {
                    dfs(i);
                    check = false;
                }
            }
            if (check) {
                cnt++;
            }
        }
    }
}
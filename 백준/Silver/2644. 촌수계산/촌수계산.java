import java.util.*;
import java.io.*;

public class Main {

    public static int N, a, b;
    public static int cnt = 0;
    public static int ans = -1;
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            list.get(c).add(d);
            list.get(d).add(c);
        }

        dfs(a, 0);
        System.out.println(ans);

    }

    private static void dfs(int x, int cnt) {
        visited[x] = true;
        for (int item : list.get(x)) {
            if(!visited[item]) {
                if (item == b) {
                    ans = cnt + 1;
                    return;
                }
                dfs(item, cnt + 1);
            }
        }
    }
}

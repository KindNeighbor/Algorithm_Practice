import java.util.*;
import java.io.*;

public class Main {

    public static int N, M, R;
    public static int count = 0;
    public static List<Integer> a[];
    public static boolean[] visited;
    public static int[] order;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        a = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        order = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            a[u].add(v);
            a[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(a[i]);
        }

        bfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(order[i]);
        }
    }

    private static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;

        while(!q.isEmpty()) {
            int num = q.poll();
            count++;
            order[num] = count;
            for(Integer i : a[num]) {
                if(!visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] cnt, arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[101];
        visited = new boolean[101];
        cnt = new int[101];

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u] = v;
        }

        bfs();
    }

    public static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        cnt[1] = 0;
        visited[1] = true;

        while (!queue.isEmpty()) {
            int a = queue.poll();
            if (a == 100) {
                System.out.println(cnt[a]);
                return;
            }

            for (int i = 1; i <= 6; i++) {
                int na = a + i;

                if (na > 100) continue;
                if (visited[na]) continue;
                visited[na] = true;

                if (arr[na] != 0) {
                    if (!visited[arr[na]]) {
                        visited[arr[na]] = true;
                        cnt[arr[na]] = cnt[a] + 1;
                        queue.offer(arr[na]);
                    }
                } else {
                    cnt[na] = cnt[a] + 1;
                    queue.offer(na);
                }
            }
        }
    }
}

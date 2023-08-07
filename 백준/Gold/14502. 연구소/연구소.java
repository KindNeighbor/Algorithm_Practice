import java.io.*;
import java.util.*;

public class Main {

    static int N, M;

    static int[][] map;

    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    static int ans = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0);
        System.out.println(ans);
    }

    public static void safe(int[][] spreadMap) {
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (spreadMap[i][j] == 0) cnt++;
            }
        }
        ans = Math.max(cnt, ans);
    }

    public static void dfs(int depth) {
        if (depth == 3) {
            bfs();
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    dfs(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void bfs() {
        int[][] spreadMap = new int[N][M];
        Queue<point> qu = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                spreadMap[i][j] = map[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (spreadMap[i][j] == 2) {
                    qu.offer(new point(i, j));
                }
            }
        }

        while (!qu.isEmpty()) {
            point p = qu.poll();

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (spreadMap[nx][ny] == 0) {
                        spreadMap[nx][ny] = 2;
                        qu.offer(new point(nx, ny));
                    }
                }
            }
        }
        safe(spreadMap);
    }

    static class point {
        int x, y;

        point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
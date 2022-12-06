import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int M, N, H;
    static int dx[] = {0, 0, 1, -1, 0, 0};
    static int dy[] = {1, -1, 0, 0, 0, 0};
    static int dz[] = {0, 0, 0, 0, -1, 1};
    static int[][][] map;

    static Queue<Pos> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];
        queue = new LinkedList<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine()," ");
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());
                    if (map[i][j][k] == 1) {
                        queue.add(new Pos(i, j, k));
                    }
                }
            }
        }
        System.out.println(bfs());
    }

    public static int bfs() {

        while (!queue.isEmpty()) {
            Pos p = queue.poll();

            int x = p.x;
            int y = p.y;
            int z = p.z;

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];

                if (nx >= 0 && ny >= 0 && nz >= 0 && nz < H && nx < N && ny < M) {
                    if (map[nz][nx][ny] == 0) {
                        queue.add(new Pos(nz, nx, ny));
                        map[nz][nx][ny] = map[z][x][y] + 1;
                    }
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[i][j][k] == 0) {
                        return -1;
                    }
                    max = Math.max(max, map[i][j][k]);
                }
            }
        }
        if (max == 1) {
            return 0;
        } else {
            return max - 1;
        }
    }

    static class Pos {
        int z;
        int x;
        int y;

        public Pos(int z, int x, int y) {
            this.z = z;
            this.x = x;
            this.y = y;
        }
    }
}

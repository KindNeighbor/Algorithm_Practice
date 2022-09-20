import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static int W,H;
    public static int cnt;
    public static boolean[][] visited;
    public static int[][] arr;
    static int[] dx = {-1, 0, 1, -1, 1, 1, 0, -1};
    static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            arr = new int[H][W];
            visited = new boolean[H][W];

            if(W == 0 && H == 0) {
                break;
            }

            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < W; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            cnt = 0;

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (!visited[i][j] && arr[i][j] == 1) {
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8 ; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < H && ny >= 0 && ny < W) {
                if (!visited[nx][ny] && arr[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
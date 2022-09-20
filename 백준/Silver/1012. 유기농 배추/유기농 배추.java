import java.io.*;
import java.util.*;

public class Main {
    
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int num = 0;
    private static int M,N;
    private static int[][] map;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            num = 0;
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            map = new int[M][N];
            visited = new boolean[M][N];

            int K = Integer.parseInt(st.nextToken());
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int b1 = Integer.parseInt(st.nextToken());
                int b2 = Integer.parseInt(st.nextToken());
                map[b1][b2] = 1;
            }

            for(int k = 0; k < M; k++) {
                for (int j = 0; j < N; j++) {
                    if(!visited[k][j] && map[k][j] == 1) {
                        dfs(k,j);
                        num++;
                    }
                }
            }
            System.out.println(num);
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < M && ny < N){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    dfs(nx,ny);
                }
            }
        }
    }
}
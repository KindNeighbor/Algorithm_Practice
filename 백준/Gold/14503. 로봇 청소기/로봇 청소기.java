import java.io.*;
import java.util.*;

public class Main {
    
    static int N, M;
    static int[][] map;
    static int cnt;
    
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        
        st = new StringTokenizer(br.readLine(), " ");
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cnt = 1;
        
        dfs(r, c, d);
        System.out.println(cnt);
    }
    
    public static void dfs(int r, int c, int d) {
        map[r][c] = -1;
        
        for (int i = 0; i < 4; i++) {
            d = (d + 3) % 4;
            int nr = r + dr[d];
            int nc = c + dc[d];
            
            if (nr >= 0 && nc >= 0 && nr < N && nc < M && map[nr][nc] == 0) {
                cnt++;
                dfs(nr, nc, d);
                return;
            }
        }
        
        int back = (d + 2) % 4;
        int backR = r + dr[back];
        int backC = c + dc[back];
        
        if(backR >= 0 && backC >= 0 && backR < N && backC < M && map[backR][backC] != 1) {
			dfs(backR, backC, d);
		}
    }
}
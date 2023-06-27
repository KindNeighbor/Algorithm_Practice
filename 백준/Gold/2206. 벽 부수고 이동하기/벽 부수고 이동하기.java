import java.util.*;
import java.io.*;

public class Main {
    
    static int N, M;
    static int[][] map;
    static boolean[][][] visit;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int ans = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new boolean[N][M][2];
        
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        }
        
        System.out.println(bfs(0,0));
    }
    
    public static int bfs(int x, int y) {
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(x, y, 1, 0));
        visit[x][y][0] = true;
        
        while (!q.isEmpty()) {
            Pos p = q.poll();
            
            if (p.x == N-1 && p.y == M-1) {
                 return p.cnt;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + p.x;
                int ny = dy[i] + p.y;
                
                if (0 <= nx && 0 <= ny && nx < N && ny < M) {
                    if (map[nx][ny] == 0 && !visit[nx][ny][p.broke]) {
                        visit[nx][ny][p.broke] = true;
                        q.add(new Pos(nx, ny, p.cnt + 1, p.broke));
                    } else if (map[nx][ny] == 1 && p.broke == 0 && !visit[nx][ny][1]) {
                        visit[nx][ny][1] = true;
                        q.add(new Pos(nx, ny, p.cnt + 1, 1));
                    }
                }
            }
        }
        return -1;
    }
    
    public static class Pos {
        int x;
        int y;
        int cnt;
        int broke;
        
        public Pos(int x, int y, int cnt, int broke) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.broke = broke;
        }
    }
}
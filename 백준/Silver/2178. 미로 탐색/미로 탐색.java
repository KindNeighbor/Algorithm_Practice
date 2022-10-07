import java.io.*;
import java.util.*;

public class Main {
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int N,M;
    private static boolean[][] visited;
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<M; j++){
                map[i][j] = Character.getNumericValue(input.charAt(j));
            }
        }
        
        bfs(0,0);
        System.out.println(map[N-1][M-1]);
    }

    private static void bfs(int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        visited[x][y] = true;
        q.offer(x);
        q.offer(y);

        while(!q.isEmpty()) {
            x = q.poll();
            y = q.poll();

            for(int i=0; i<4; i++){

                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >=0 && ny >=0 && nx < N && ny < M){
                    if(map[nx][ny] > 0 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        map[nx][ny] = map[x][y] + 1;
                        q.offer(nx);
                        q.offer(ny);
                    }
                }
            }
        }
    }
}
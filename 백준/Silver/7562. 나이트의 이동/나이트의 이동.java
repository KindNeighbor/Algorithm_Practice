import java.io.*;
import java.util.*;

public class Main {

    public static boolean[][] visited;
    public static int[][] map;
    public static int N,a;
    public static int[][] dir = {{-1,-2},{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2}};
    public static int Start_X, Start_Y, End_X, End_Y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            a = Integer.parseInt(br.readLine());
            visited = new boolean[a][a];
            map = new int[a][a];

            st = new StringTokenizer(br.readLine()," ");
            Start_X = Integer.parseInt(st.nextToken());
            Start_Y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine()," ");
            End_X = Integer.parseInt(st.nextToken());
            End_Y = Integer.parseInt(st.nextToken());

            bfs(new Var(Start_X,Start_Y));
            System.out.println(map[End_X][End_Y]);
        }
    }

    public static void bfs(Var d) {
        Queue<Var> q = new LinkedList<>();
        q.offer(d);
        visited[d.x][d.y] = true;

        while(!q.isEmpty()) {
            Var b = q.poll();
            int x = b.x;
            int y = b.y;

            if(x == End_X && y == End_Y) {
                break;
            }

            for (int i = 0; i < 8; i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];

                if(nx >=0 && ny >=0 && nx < a && ny < a) {
                    if(!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        map[nx][ny] = map[x][y] + 1;
                        q.offer(new Var(nx,ny));
                    }
                }
            }
        }
    }

    static class Var {
        int x;
        int y;

        public Var(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

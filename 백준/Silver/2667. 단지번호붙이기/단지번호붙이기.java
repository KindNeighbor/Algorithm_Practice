import java.io.*;
import java.util.*;

public class Main {
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int[] a = new int[25*25];
    private static int n;
    private static int num = 0; //아파트 단지 번호의 수
    private static boolean[][] visited = new boolean[25][25]; //방문여부
    private static int[][] map = new int[25][25]; //지도

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            String input = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = Character.getNumericValue(input.charAt(j));
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    num++;
                    dfs(i,j);
                }
            }
        }

        Arrays.sort(a);
        System.out.println(num);

        for(int i=0; i<a.length; i++){
            if(a[i] == 0){
            }else{
                System.out.println(a[i]);
            }
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        a[num]++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < n && ny < n){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    dfs(nx,ny);
                }
            }
        }
    }
}
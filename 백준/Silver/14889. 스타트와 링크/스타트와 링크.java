import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[][] map;
    static boolean[] check;

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        check = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0,0 );
        System.out.println(min);
    }

    public static void dfs(int depth, int start) {
        if (depth == N / 2) {
            subtract();
            return;
        }

        for (int i = start; i < N; i++) {
            check[i] = true;
            dfs(depth + 1, i + 1);
            check[i] = false;
        }
    }

    public static void subtract() {
        int teamA = 0;
        int teamB = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (check[i] == true && check[j] == true) {
                    teamA += map[i][j];
                    teamA += map[j][i];
                } else if (check[i] == false && check[j] == false) {
                    teamB += map[i][j];
                    teamB += map[j][i];
                }
            }
        }

        int a = Math.abs(teamA - teamB);
        if (a == 0) {
            System.out.println(0);
            System.exit(0);
        }

        min = Math.min(a, min);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static int min = 64;
    public static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            for (int j = 0; j < M; j++) {
                if(s.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int cut_N = N - 7;
        int cut_M = M - 7;

        for (int i = 0; i < cut_N; i++) {
            for (int j = 0; j < cut_M; j++) {
                sol(i,j);
            }
        }
        System.out.println(min);
    }

    public static void sol(int a, int b) {
        int end_A = a + 8;
        int end_B = b + 8;
        int cnt = 0;

        boolean BW = arr[a][b];

        for (int i = a; i < end_A ; i++) {
            for (int j = b; j < end_B; j++) {
                if(arr[i][j] != BW) {
                    cnt++;
                }
                BW = !BW;
            }
            BW = !BW;
        }
        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }
}

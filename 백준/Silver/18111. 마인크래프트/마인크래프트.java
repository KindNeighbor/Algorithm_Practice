import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int map[][] = new int[N][M];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, map[i][j]);
                min = Math.min(min, map[i][j]);
            }
        }

        int maxHeight = 0;
        int minTime = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) {
            int time = 0;
            int block = B;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (map[j][k] > i) {
                        time = time + 2 * (map[j][k] - i);
                        block = block + map[j][k] - i;
                    }
                    else if (map[j][k] < i) {
                        time = time + i - map[j][k];
                        block = block - i + map[j][k];
                    }
                }
            }

            if (block < 0) {
                break;
            }

            if (minTime >= time) {
                minTime = time;
                maxHeight = i;
            }
        }
        System.out.println(minTime + " " + maxHeight);
    }
}
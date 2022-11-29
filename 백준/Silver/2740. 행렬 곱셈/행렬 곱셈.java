import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr2 = new int[M][K];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < K; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] arr3 = new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < K; k++) {
                    arr3[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
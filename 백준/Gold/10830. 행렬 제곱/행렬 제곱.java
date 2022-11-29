import java.io.*;
import java.util.*;

public class Main {
    
    static int N;
    static int A = 1000;

    static int[][] arrInitial;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        arrInitial = new int[N][N];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arrInitial[i][j] = Integer.parseInt(st.nextToken()) % A;
            }
        }

        int[][] finalMatrix = Calculate(arrInitial, B);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(finalMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {
        int[][] newMatrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    newMatrix[i][j] += arr1[i][k] * arr2[k][j];
                    newMatrix[i][j] %= A;
                }
            }
        }

        return newMatrix;
    }

    public static int[][] Calculate(int[][] arr1, long b) {
        if (b == 1) {
            return arr1;
        }

        int[][] newMatrix = Calculate(arr1, b / 2);

        newMatrix = multiplyMatrix(newMatrix, newMatrix);

        if (b % 2 == 1) {
            newMatrix = multiplyMatrix(newMatrix, arrInitial);
        }

        return newMatrix;
    }
}
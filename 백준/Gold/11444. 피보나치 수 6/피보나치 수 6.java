import java.io.*;
import java.util.*;

public class Main {
    
    static long A = 1000000007;

    static long[][] arrInitial = {{1, 1} , {1, 0}};;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        long[][] arr = {{1, 1}, {1, 0}};

        long[][] finalMatrix = Calculate(arr, N - 1);
        System.out.println(finalMatrix[0][0]);
    }

    public static long[][] multiplyMatrix(long[][] arr1, long[][] arr2) {
        long[][] newMatrix = new long[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    newMatrix[i][j] += arr1[i][k] * arr2[k][j];
                    newMatrix[i][j] %= A;
                }
            }
        }

        return newMatrix;
    }

    public static long[][] Calculate(long[][] arr, long b) {
        if (b == 1 || b == 0) {
            return arr;
        }

        long[][] newMatrix = Calculate(arr, b / 2);

        newMatrix = multiplyMatrix(newMatrix, newMatrix);

        if (b % 2 == 1) {
            newMatrix = multiplyMatrix(newMatrix, arrInitial);
        }

        return newMatrix;
    }
}
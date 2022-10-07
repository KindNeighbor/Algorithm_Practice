import java.io.*;
import java.util.*;

public class Main {

    public static int[] arr1;
    public static int[] arr2;

    public static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            sb.append(dp1(a)).append(" ").append(dp2(a)).append("\n");
        }
        System.out.println(sb);
    }

    public static int dp1(int a) {
        arr1 = new int[a+2];
        arr1[0] = 1;
        arr1[1] = 0;
        for (int i = 2; i <= a; i++) {
            arr1[i] = arr1[i-1] + arr1[i-2];
        }
        return arr1[a];
    }

    public static int dp2(int a) {
        arr2 = new int[a+2];
        arr2[0] = 0;
        arr2[1] = 1;
        for (int i = 2; i <= a; i++) {
            arr2[i] = arr2[i-1] + arr2[i-2];
        }
        return arr2[a];
    }
}

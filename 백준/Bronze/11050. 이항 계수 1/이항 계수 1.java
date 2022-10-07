import java.io.*;
import java.util.*;

public class Main {

    public static int n,k;

    public static int[][] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n+1][k+1];
        int c = sol(n,k);
        System.out.println(c);


    }

    public static int sol(int a, int b) {
        for (int i = 0; i <= k; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i <= n; i++) {
            arr[i][0] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for(int j = 1; j <= k; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        return arr[a][b];
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = -1;
        int idxI = -1;
        int idxJ = -1;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    idxI = i;
                    idxJ = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(++idxI + " " + ++idxJ);
    }
}
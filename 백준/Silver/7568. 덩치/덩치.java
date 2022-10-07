import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] a = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int x = 1;
            for (int j = 0; j < N; j++) {
                if(i == j) {
                    continue;
                } else if(a[i][0] < a[j][0] && a[i][1] < a[j][1]) {
                    x++;
                }
            }
            System.out.print(x + " ");
        }
    }
}
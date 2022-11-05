import java.io.*;

public class Main {

    public static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        recursion(N, 0, 0, false);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public static void recursion(int N, int x, int y, boolean check) {
        if (check) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }
        
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }

       int n = N / 3;
       int cnt = 0;
       for (int i = x; i < x + N; i += n) {
           for (int j = y; j < y + N; j += n) {
               cnt++;
               if (cnt == 5) {
                   recursion(n, i, j, true);
               } else {
                   recursion(n, i, j, false);
               }
           }
       }
    }
}
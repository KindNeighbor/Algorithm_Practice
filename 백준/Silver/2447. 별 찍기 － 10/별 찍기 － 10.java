import java.io.*;
import java.util.*;

public class Main {

    static char[][] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        a = new char[N][N];

        recu(N, 0, 0, false);
        
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                sb.append(a[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static void recu(int N, int x, int y, boolean blank) {

        if(blank) {
            for(int i=x; i<(x+N); i++) {
                for(int j=y; j<(y+N); j++) {
                    a[i][j] = ' ';
                }
            }
            return;
        }

        if(N == 1) {
            a[x][y] = '*';
            return;
        }

        int b = (N / 3);
        int cnt = 0;
        for(int i=x; i<(x+N); i = i + b) {
            for(int j=y; j<(y+N); j = j + b) {
                cnt++;
                if(cnt == 5) {
                    recu(b, i, j, true);
                } else {
                    recu(b, i, j, false);
                }
            }
        }
    }
}
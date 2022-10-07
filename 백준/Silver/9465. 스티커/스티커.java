import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] a = new int[2][N+1];
            int[][] b = new int[2][N+1];
            for(int w=0; w<2; w++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=1; j<N+1; j++) {
                    b[w][j] = Integer.parseInt(st.nextToken());
                }
            }
            a[0][1] = b[0][1];
            a[1][1] = b[1][1];
            
            for(int k=2; k<N+1; k++) {
                a[0][k] = Math.max(a[1][k-1] , a[1][k-2]) + b[0][k];
                a[1][k] = Math.max(a[0][k-1] , a[0][k-2]) + b[1][k];
            }
            System.out.println(Math.max(a[0][N], a[1][N]));
        }
    }
}

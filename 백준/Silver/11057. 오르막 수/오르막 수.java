import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] a = new int[N+1][10];
        
        for(int i=0; i<10; i++) {
            a[1][i] = 1; 
        }
        
        for(int i=1; i<N+1; i++) {
            for(int j=0; j<10; j++) {
                for(int k=j; k<10; k++) {
                    a[i][j] = a[i][j] + a[i-1][k];
                    a[i][j] = a[i][j] % 10007;
                }
            }
        }
        
        int ans = 0;
        for(int i=0; i<10; i++) {
            ans = ans + a[N][i];
        }
        System.out.println(ans % 10007);
    }
}
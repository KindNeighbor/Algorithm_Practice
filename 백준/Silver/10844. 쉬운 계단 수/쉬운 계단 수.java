import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        long X = 1000000000;
        
        long[][] a = new long[N+1][10];
        
        a[1][0] = 0;
        for(int i=1; i<10; i++) {
            a[1][i] = 1;
        }
        
        for(int i=2; i<=N; i++) {
            for(int j=0; j<10; j++) {
                if(j == 0) {
                    a[i][j] = a[i-1][j+1] % X;
                }
                else if(j == 9) {
                    a[i][j] = a[i-1][j-1] % X;
                }
                else {
                    a[i][j] = (a[i-1][j+1] + a[i-1][j-1]) % X;
                }
            }
        }
        
        long ans = 0;
        for(int i=0; i<10; i++) {
            ans = ans + a[N][i];
        }
        
        System.out.println(ans % X);
        
    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        long[] a = new long[N+1];
        a[0] = 0; a[1] = 1;
        for(int i=2; i<=N; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        System.out.println(a[N]);
    }
}
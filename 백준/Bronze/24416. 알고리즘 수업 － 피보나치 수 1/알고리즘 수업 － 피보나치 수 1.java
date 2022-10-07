import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        sb.append(fib(n) + " " + (n-2));
        System.out.print(sb);
        
    }
    
    public static int fib(int n) {
        int[] a = new int[n+1];
        a[1] = a[2] = 1;
        for(int i=3; i<=n; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }
}
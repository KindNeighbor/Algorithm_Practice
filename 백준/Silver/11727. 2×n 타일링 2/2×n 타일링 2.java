import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[1001];
        a[1] = 1; a[2] = 3;
        for(int i=3; i<=n; i++) {
            a[i] = a[i-1] + a[i-2] * 2;
            a[i] = a[i] % 10007;
        }
        System.out.println(a[n]);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N+1];
        a[0] = 0; a[1] = 0;
        for(int i=2; i<=N; i++) {
            a[i] = a[i-1] + 1;
            if(i%3 == 0) {
                a[i] = Math.min(a[i],a[i/3]+1);
            }
            if(i%2 == 0) {
                a[i] = Math.min(a[i],a[i/2]+1);
            }     
        }
        System.out.println(a[N]);
    }
}
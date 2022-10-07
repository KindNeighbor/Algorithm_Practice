import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[11];
        a[1] = 1;  a[2] = 2;  a[3] = 4;
        for(int i=0; i<n; i++) {
            int T = Integer.parseInt(br.readLine());
            for(int j = 4; j<=T; j++) {
                a[j] = a[j-1] + a[j-2] + a[j-3];  
            }
            System.out.println(a[T]);
        }
    }
}
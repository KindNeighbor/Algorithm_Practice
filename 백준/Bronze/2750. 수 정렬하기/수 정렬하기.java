import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        for(int i=0; i<N; i++) {
            System.out.println(a[i]);
        }
    }
}
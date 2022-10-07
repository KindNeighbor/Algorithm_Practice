import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] a = new int[10001];
        
        for(int i=0; i<N; i++) {
            a[Integer.parseInt(br.readLine())]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<10001; i++) {
            while(a[i] > 0) {
                sb.append(i).append("\n");
                a[i]--;
            }
        }
        System.out.println(sb);
    }
}
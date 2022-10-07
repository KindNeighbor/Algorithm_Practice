import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");                  
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(a);
        
        int sum = 0;
        int add = 0;
        for(int i=0; i<N; i++) {
            add = add + a[i];
            sum = sum + add;
        }
        System.out.println(sum);
    }
}
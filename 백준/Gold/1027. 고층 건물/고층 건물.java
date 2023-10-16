import java.io.*;
import java.util.*;

public class Main {
    
    static int N;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, sol(i));
        }
        
        System.out.println(max);
    }
    
    public static int sol(int x) {
        int cnt = 0;
        double temp = 0;
        
        for (int i = x - 1; i >= 0; i--) {
            double diff = (double)(arr[x] - arr[i]) / (x - i);
            
            if (i == x - 1 || temp > diff) {
                cnt++;
                temp = diff;
            }
        }
        
        for (int i = x + 1; i < N; i++) {
            double diff = (double)(arr[x] - arr[i]) / (x - i);
            
            if (i == x + 1 || temp < diff) {
                cnt++;
                temp = diff;
            }
        }
        
        return cnt;
    }
}
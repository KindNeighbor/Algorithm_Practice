import java.io.*;
import java.util.*;

public class Main {
    
    static int N;
    static int[] arr;
    static boolean[] visit;
    static int max = Integer.MIN_VALUE;
    static int[] arr2;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        arr2 = new int[N];
        visit = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        backTracking(0);
        System.out.println(max);
    }
    
    public static void backTracking(int depth) {
        if (depth == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(arr2[i] - arr2[i+1]);
            }
            max = Math.max(sum, max);
        }
        
        for (int i = 0; i < N; i++) {
            if (visit[i]) continue;
            arr2[depth] = arr[i];
            visit[i] = true;
            backTracking(depth + 1);
            visit[i] = false;
        }
    }
}
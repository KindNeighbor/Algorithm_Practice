import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        
        StringBuilder sb;
        StringTokenizer st;
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr);
            
            int max = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                max = Math.max(max, arr[j + 1] - arr[j]);
            }
            
            sb = new StringBuilder();
            sb.append("Class ").append(i + 1).append("\n")
                .append("Max ").append(arr[arr.length - 1]).append(", ")
                .append("Min ").append(arr[0]).append(", ")
                .append("Largest gap ").append(max).append("\n");
            System.out.print(sb);
        }
    }
}
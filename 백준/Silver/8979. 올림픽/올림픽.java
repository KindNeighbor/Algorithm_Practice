import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[N+1][3];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            arr[idx][0] = Integer.parseInt(st.nextToken());
            arr[idx][1] = Integer.parseInt(st.nextToken());
            arr[idx][2] = Integer.parseInt(st.nextToken());
        }
        
        int rank = 1;
        for (int i = 1; i <= N; i++) {
            if (arr[i][0] > arr[K][0]) {
                rank++;
            } else if (arr[i][0] == arr[K][0] && arr[i][1] > arr[K][1]) {
                rank++;
            } else if (arr[i][0] == arr[K][0] && arr[i][1] == arr[K][1] 
                       && arr[i][2] > arr[K][2]) {
                rank++;
            }
        }
        System.out.println(rank);
    }
}
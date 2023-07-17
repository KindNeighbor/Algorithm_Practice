import java.io.*;
import java.util.*;

public class Main {
    
    static int N;
    static int[] arr1;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            arr1 = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr1[j] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr1);
            
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                if (find(Integer.parseInt(st.nextToken()))) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
    
    public static boolean find(int x) {
        int l = 0;
        int r = N - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr1[mid] == x) {
                return true;
            } else if (arr1[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
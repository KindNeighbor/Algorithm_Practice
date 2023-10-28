import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[5];
            for (int j = 0; j < 5; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr);
            if (arr[3] - arr[1] >= 4) {
                sb.append("KIN").append("\n");
            } else {
                int sum = arr[1] + arr[2] + arr[3];
                sb.append(sum).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}
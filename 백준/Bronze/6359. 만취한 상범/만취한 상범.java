import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            
            boolean[] arr = new boolean[n+1];
            
            for (int j = 1; j <= n; j++) {
                for (int k = 1; j*k <= n; k++) {
                    if (arr[j*k]) arr[j*k] = false;
                    else arr[j*k] = true;
                }
            }
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                if (arr[j]) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
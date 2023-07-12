import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        int l = 0;
        int r = -1;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            r = Math.max(r, arr[i]);
        }
        
        int M = Integer.parseInt(br.readLine());
        while (l <= r) {
            
            int mid = (l + r) / 2;
            long ans = 0;
            
            for(int i = 0; i < N; i++) {
				if(arr[i] > mid) ans += mid;
				else ans += arr[i];
			}
            
			if(ans <= M) l = mid + 1;
            else r = mid - 1;
        }
        System.out.print(r);
    }
}
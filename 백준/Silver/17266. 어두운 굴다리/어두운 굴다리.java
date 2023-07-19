import java.io.*;
import java.util.*;

public class Main {
    
    static int N;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        arr = new int[M];
               
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
		
		int l = 1;
		int r = N;
		int result = 0;

		while(l <= r) {
			int mid = (l + r) / 2;

			if (possible(mid)) {
				result = mid;
				r = mid-1;
			} else {
                l = mid+1;
            }
		}
		
		System.out.println(result);
        
    }
    
    static boolean possible(int target) {
		int prev = 0; 
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] - target <= prev) {
				prev = arr[i] + target;
			} else {
                return false;
            }
		}
		return N - prev <= 0;
	}
}
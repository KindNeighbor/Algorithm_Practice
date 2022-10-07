import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        int[] a = new int[K];
        long MAX = 0;
        
        for (int i = 0; i < K; i++) {
			a[i] = Integer.parseInt(br.readLine());
			if(MAX < a[i]) {
				MAX = a[i];
			}
		}
        
        long MIN = 0;
        long MID = 0;
        MAX++;
        
        while(MAX > MIN) {
            MID = (MAX+MIN)/2;
            long cnt = 0;
            
            for (int i = 0; i < a.length; i++) {
				cnt = cnt + (a[i] / MID);
			}
            
            if(cnt < N) {
                MAX = MID;
            } else {
                MIN = MID + 1;
            }
        }          
        System.out.println(MIN-1);
    }
}
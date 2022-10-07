import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        long MAX = 0;
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if(MAX < a[i]) {
                MAX = a[i];
            }
        }
        
        MAX++;
        long MIN = 0; 
        long MID = 0;
      
        while(MAX > MIN) {
            
            MID = (MAX+MIN)/2;
            long cnt = 0;
            
            for(int i=0; i<a.length; i++) {
                if(a[i]>MID) {
                    cnt = cnt + a[i] - MID;
                }
            }
            
            if(cnt < M) {
                MAX = MID;
            } else {
                MIN = MID + 1;
            }
        }
        System.out.println(MIN - 1);
    }
}
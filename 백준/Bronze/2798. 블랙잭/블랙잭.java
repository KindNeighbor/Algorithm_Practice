import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        int near = 0;
        
        int[] a = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for(int k=j+1; k<N; k++) {
                    sum = a[i] + a[j] + a[k];
                    if(near < sum && sum <= M) {
                        near = sum;
                    }
                }
            }
        }
        System.out.println(near);        
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        double sum = 0;
        
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum = sum + a[i];
        }
        
        int count = 0;
        int mode = a[0];
        int max = -1;
        boolean b = false;
        
        Arrays.sort(a);
        
        for(int i=0; i<N-1; i++) {
            if(a[i] == a[i+1]) {
                count++;
            } else {
                count = 0;
            }
            
            if(max < count) {
                max = count;
                mode = a[i];
                b = true;
            } else if(max == count && b == true) {
                mode = a[i];
                b = false;
            }
        }
        System.out.println(Math.round(sum/N));
        System.out.println(a[((N-1)/2)]);
        System.out.println(mode);
        System.out.println(a[N-1]-a[0]);
    }
}
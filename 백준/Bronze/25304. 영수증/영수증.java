import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        int sum = 0;
        int AB = 0;
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            AB = a * b;
            sum = sum + AB;
        }
        
        if(sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
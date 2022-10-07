import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
        int K = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int Kn = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        System.out.print(1 - K + " ");
        System.out.print(1 - Q + " ");
        System.out.print(2 - R + " ");
        System.out.print(2 - B + " ");
        System.out.print(2 - Kn + " ");
        System.out.print(8 - P);
        
    } 
}
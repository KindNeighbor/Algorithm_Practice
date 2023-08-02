import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int X1 = Integer.parseInt(st.nextToken());
        int Y1 = Integer.parseInt(st.nextToken());
        int R1 = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int X2 = Integer.parseInt(st.nextToken());
        int Y2 = Integer.parseInt(st.nextToken());
        int R2 = Integer.parseInt(st.nextToken());
       
        if (1l * (X2 - X1) * (X2 - X1) + 1l * (Y2 - Y1) * (Y2 - Y1)< 1l * (R1 + R2) * (R1 + R2)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
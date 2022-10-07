import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        
        int X_Min = Math.min(X, W-X);
        int Y_Min = Math.min(Y, H-Y);
        
        int ans = 0;
        ans = Math.min(X_Min, Y_Min);
        System.out.println(ans);
    }
}